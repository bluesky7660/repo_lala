package com.lalaping.infra.pdf;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lalaping.afterReport.AfterReportDto;
import com.lalaping.afterReport.AfterReportService;

@Controller
public class PdfController {

    @Autowired
    AfterReportService afterReportService;
    
    @Autowired
    PdfService pdfService;

    // PDF 생성 후 다운로드 처리
    @GetMapping("/generate-pdf")
    public ResponseEntity<byte[]> generatePdf(@RequestParam("arSeq") String arSeq, AfterReportDto afterReportDto) {
        // arSeq 값을 DTO에 설정
        afterReportDto.setArSeq(arSeq);

        // 데이터베이스에서 arSeq에 해당하는 데이터를 가져옴
        AfterReportDto data = afterReportService.selectOne(afterReportDto);

        // 생성할 PDF 파일 경로
        String filePath = "민원_후_처리보고서_" + data.getArSeq() + ".pdf";

        // PDF 파일 생성
        pdfService.createPdf(filePath, data);

        try {
            // 생성된 PDF 파일을 바이트 배열로 읽음
            Path path = Paths.get(filePath);
            byte[] pdfContents = Files.readAllBytes(path);

            // 파일 이름을 URL 인코딩
            String encodedFileName = URLEncoder.encode(filePath, StandardCharsets.UTF_8.toString());

            // HTTP 응답 헤더 설정
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("attachment", encodedFileName); // 인코딩된 파일 이름 사용

            // PDF 파일을 응답으로 반환
            return new ResponseEntity<>(pdfContents, headers, HttpStatus.OK);

        } catch (IOException e) {
            e.printStackTrace();
            // 오류가 발생하면 500 에러 응답
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
