package com.lalaping.infra.pdf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.lalaping.afterReport.AfterReportDto;

@Service
public class PdfService {
	public void createPdf(String filePath, AfterReportDto data) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            document.addTitle(data.getArTitle());
            // 데이터 추가
            document.add(new Paragraph(data.toString()));  // AfterReportDto 객체의 데이터를 원하는 형식으로 추가

        } catch (DocumentException | IOException e) {
            e.printStackTrace();  // 예외가 발생하면 오류를 출력
        } finally {
            document.close();  // 문서를 닫음 (필수)
        }
    }
}
