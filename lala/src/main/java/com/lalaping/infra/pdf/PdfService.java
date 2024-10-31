package com.lalaping.infra.pdf;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.lalaping.afterReport.AfterReportDto;

@Service
public class PdfService {
	public void createPdf(String filePath, AfterReportDto data) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            
//            document.addTitle(data.getArTitle());
            // 데이터 추가
//            document.add(new Paragraph(data.toString()));  // AfterReportDto 객체의 데이터를 원하는 형식으로 추가
            // AfterReportDto 데이터를 PDF에 추가
            System.out.println("민원 번호: " + data.getArSeq());
            System.out.println("작성자: " + data.getSfName());
            System.out.println("보고서 제목: " + data.getArTitle());
            System.out.println("보고서 내용: " + data.getArContent());

         // BaseFont 생성 (한글 폰트 사용)
            BaseFont baseFont = BaseFont.createFont("xdm/v1/font/NanumGothic-Regular.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(baseFont, 12); // 폰트 크기 설정
//            System.out.println("font: " + font.get);
            // 내용 추가
            document.add(new Paragraph("민원 번호: " + data.getArSeq(), font));
            document.add(new Paragraph("작성자: " + data.getSfName(), font));
            document.add(new Paragraph("보고서 제목: " + data.getArTitle(), font));
            document.add(new Paragraph("보고서 내용: " + data.getArContent(), font));
            
        } catch (DocumentException | IOException e) {
            e.printStackTrace();  // 예외가 발생하면 오류를 출력
        } finally {
            document.close();  // 문서를 닫음 (필수)
        }
    }
}
