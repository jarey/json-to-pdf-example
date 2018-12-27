package example;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import cljpdf.text.BadElementException;
import cljpdf.text.Document;
import cljpdf.text.Element;
import cljpdf.text.Image;
import cljpdf.text.Paragraph;
import cljpdf.text.Phrase;
import cljpdf.text.pdf.ColumnText;
import cljpdf.text.pdf.PdfContentByte;
import cljpdf.text.pdf.PdfPageEventHelper;
import cljpdf.text.pdf.PdfWriter;

public class FooterHeaderPageHandler extends PdfPageEventHelper{
	
	private Image imgLeft;
	private Paragraph parrafo;
	private Image imgRight;
	
    public FooterHeaderPageHandler(String imageLeftPath, String imageRightPath)
            throws BadElementException, MalformedURLException, IOException {
        //Imagen de la izquierda
    	File fileLeft = new File(imageLeftPath);
        this.imgLeft = Image.getInstance(fileLeft.getPath());
        this.imgLeft.scaleToFit(100, 100);
        this.imgLeft.setAbsolutePosition(25,805);
        //P¨¢rrafo central
        this.parrafo = new Paragraph("Direcci¨®n jefatura.\n Segunda linea direccion. Tercera Linea Direccion.");
        this.parrafo.setAlignment(Element.ALIGN_CENTER);
        //Imagen de la derecha
        File fileRight = new File(imageRightPath);
        this.imgRight = Image.getInstance(fileRight.getPath());
        this.imgRight.scaleToFit(100, 100);
        this.imgRight.setAbsolutePosition(500,805);
    }

    @Override
    public void onStartPage(PdfWriter writer, Document document) {
        try {
        	PdfContentByte cb = writer.getDirectContent();
            cb.addImage(this.imgLeft);
            
            Phrase header = new Phrase("Ah ah ah ah Staying Alive ");
            Phrase header2 = new Phrase("Staying Alive Bitch");
            Phrase header3 = new Phrase("Corre pl¨¢tano!");
            
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    header,
                    (document.right() - document.left()) / 2 + document.leftMargin(),
                    document.top() + 10, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    header2,
                    (document.right() - document.left()) / 2 + document.leftMargin(),
                    document.top(), 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    header3,
                    (document.right() - document.left()) / 2 + document.leftMargin(),
                    document.top() -10, 0);
            
            cb.addImage(this.imgRight);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
