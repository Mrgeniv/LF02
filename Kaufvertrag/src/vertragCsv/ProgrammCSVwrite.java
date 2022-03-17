package vertragCsv;

import java.io.*;

public class ProgrammCSVwrite {

    public static void main(String[] args) throws IOException {
        Kaufvertrag kaufvertrag = erstelleVertrag();
        erstelleCsv(kaufvertrag);
    }
    private static void erstelleCsv(Kaufvertrag kaufvertrag) throws IOException {

        String datei = "H:/LF02/Kaufvertrag/src/Kaufvertrag.csv";
        PrintWriter writer= new PrintWriter(datei);

        writer.print("Partner;"+"Name;"+"AusweisNr.;"+"Plz;"+"Ort;"+"Strasse;"+"HausNr.;"+"\n");
        writer.print("Kaeufer;");
        writer.print(kaufvertrag.getKaeufer().getVorname()+" "+kaufvertrag.getKaeufer().getNachname()+";");
        writer.print(kaufvertrag.getKaeufer().getAusweisNr()+";"+kaufvertrag.getKaeufer().getAdresse().getPlz()+";"
                +kaufvertrag.getKaeufer().getAdresse().getOrt()+";"+ kaufvertrag.getKaeufer().getAdresse().getStrasse()+";"
                +kaufvertrag.getKaeufer().getAdresse().getHausNr()+"\n");

        writer.print("Verkaeufer;");
        writer.print(kaufvertrag.getVerkaeufer().getVorname()+" "+kaufvertrag.getVerkaeufer().getNachname()+";");
        writer.print(kaufvertrag.getVerkaeufer().getAusweisNr()+";"+kaufvertrag.getVerkaeufer().getAdresse().getPlz()+";"
                +kaufvertrag.getVerkaeufer().getAdresse().getOrt()+";"+ kaufvertrag.getVerkaeufer().getAdresse().getStrasse()+";"
                +kaufvertrag.getVerkaeufer().getAdresse().getHausNr()+"\n");

        writer.close();

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
}
