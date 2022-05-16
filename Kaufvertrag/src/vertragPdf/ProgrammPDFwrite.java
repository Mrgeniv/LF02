package vertragPdf;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;


import java.io.FileNotFoundException;
import java.io.IOException;

public class ProgrammPDFwrite {


    public static void main(String[] args) throws IOException {
        Kaufvertrag kaufvertrag = erstelleVertrag();
        erstellePDF(kaufvertrag);


    }

    private  static Kaufvertrag erstelleVertrag() throws FileNotFoundException {
        Ware ware = new Ware("Laptop", 250.0);
        ware.setBeschreibung("Super krasses Gaming-Laptop");
        ware.getBesonderheitenListe().add("Tasche");
        ware.getBesonderheitenListe().add("Gaming-Maus");
        ware.getMaengelListe().add("Ladekabel fehlt");
        ware.getMaengelListe().add("Touchpad defekt");

        Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt");
        kaeufer.setAusweisNr("0123456789");
        kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

        Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull");
        verkaeufer.setAusweisNr("9876543210");
        verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));

        Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
        vertrag.setZahlungsModalitaeten("Privater Barverkauf");
        return vertrag;

    }

    private  static void erstellePDF(Kaufvertrag kaufvertrag) throws IOException{
        //PdfWriter erstellen
        String datei = "H:/LF02/Kaufvertrag/src/Kaufvertrag.pdf";
        PdfWriter writer = new PdfWriter(datei);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);

        //------------------------ TEXTFORMATIERUNG ------------------------
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        document.setFont(font);
        document.setFontSize(12);
        document.setBold();
        document.setItalic();
        document.setTextAlignment(TextAlignment.LEFT);
        document.setFontColor(new DeviceRgb(0,0,0));
        //------------------------ STYLES ------------------------
        Style styleNormal = new Style();
        styleNormal.setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA));
        styleNormal.setFontSize(12);
        Style styleSpecial = new Style();
        PdfFont fontSpecial = PdfFontFactory.createFont(StandardFonts.COURIER);
        DeviceRgb colorSpecial = new DeviceRgb(255, 0,0);
        styleSpecial.setFont(fontSpecial).setFontSize(12).setFontColor(colorSpecial);

        //------------------------ TABLE ------------------------
        // Tabelle erstellen
        Table table = new Table(2);
        table.useAllAvailableWidth();
        // Kopfzeile erstellen
        Cell header1 = new Cell();
        header1.add(new Paragraph());




        //------------------------ ÜBERSCHRIFT ------------------------
        Paragraph p1 = new Paragraph("Kaufvertrag\n\n").setTextAlignment(TextAlignment.CENTER);
        DeviceRgb.makeDarker(colorSpecial);
        p1.addStyle(styleNormal);
        document.add(p1);

        //------------------------ KÄUFER-INFO ------------------------
        Paragraph p2 = new Paragraph("Käufer\n\n");
        p2.addStyle(styleNormal);
        p2.add(kaufvertrag.getKaeufer().getNachname()+", "+kaufvertrag.getKaeufer().getVorname()+"\n");
        p2.add("AusweisNr: "+kaufvertrag.getKaeufer().getAusweisNr()+"\n");
        p2.add("Adresse: "+kaufvertrag.getKaeufer().getAdresse().getStrasse()+" "+kaufvertrag.getKaeufer().getAdresse().getHausNr()+", "+kaufvertrag.getKaeufer().getAdresse().getPlz()+" "+kaufvertrag.getKaeufer().getAdresse().getOrt()+"\n\n");
        document.add(p2);
        //------------------------ VERKÄUFER-INFO ------------------------
        Paragraph p3 = new Paragraph("Verkäufer\n\n");
        p3.addStyle(styleNormal);
        p3.add(kaufvertrag.getVerkaeufer().getNachname()+", "+kaufvertrag.getVerkaeufer().getVorname()+"\n");
        p3.add("AusweisNr: "+kaufvertrag.getVerkaeufer().getAusweisNr()+"\n");
        p3.add("Adresse: "+kaufvertrag.getVerkaeufer().getAdresse().getStrasse()+" "+kaufvertrag.getVerkaeufer().getAdresse().getHausNr()+", "+kaufvertrag.getVerkaeufer().getAdresse().getPlz()+" "+kaufvertrag.getVerkaeufer().getAdresse().getOrt()+"\n\n");
        document.add(p3);
        //------------------------ WAREN-INFO ------------------------
        Paragraph p4 = new Paragraph("Verkaufte Waren\n\n");
        p4.addStyle(styleNormal);
        p4.add(kaufvertrag.getWare().getBezeichnung()+"\n");
        p4.add("Beschreibung: "+kaufvertrag.getWare().getBeschreibung()+"\n");
        p4.add("preis: "+kaufvertrag.getWare().getPreis()+"\n");
        p4.add("Besonderheiten; "+kaufvertrag.getWare().getBesonderheitenListe()+"\n");
        p4.add("Mängel: "+kaufvertrag.getWare().getMaengelListe()+"\n");
        p4.add("\n");
        p4.add("Zahlungsmodalitäten: \n\n");
        p4.add(kaufvertrag.getZahlungsModalitaeten());
        document.add(p4);
        document.close();

    }
}
