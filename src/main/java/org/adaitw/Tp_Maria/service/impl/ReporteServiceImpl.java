package org.adaitw.Tp_Maria.service.impl;



import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import org.adaitw.Tp_Maria.service.ReporteService;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@Service
public class ReporteServiceImpl implements ReporteService {



    @Override
    public void export(HttpServletResponse response) throws IOException {
        com.lowagie.text.Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontTitle.setSize(18);

        Paragraph paragraph = new Paragraph("REPORTE FINAL", fontTitle);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);

        Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA);
        fontParagraph.setSize(14);

        Paragraph paragraph2 = new Paragraph("Numero de Conceptos: 5", fontParagraph);
        paragraph2.setAlignment(Paragraph.ALIGN_LEFT);

        Paragraph paragraph3 = new Paragraph("Numero de Preguntas: 12", fontParagraph);
        paragraph2.setAlignment(Paragraph.ALIGN_LEFT);

        Paragraph paragraph4 = new Paragraph("Numero de Respuestas: 32", fontParagraph);
        paragraph2.setAlignment(Paragraph.ALIGN_LEFT);

        document.add(paragraph);
        document.add(paragraph2);
        document.add(paragraph3);
        document.add(paragraph4);
        document.close();
    }
}



