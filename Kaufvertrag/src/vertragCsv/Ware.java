package vertragCsv;

import java.util.ArrayList;
import java.util.List;

public class Ware {

    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private List<String> besonderheitenListe;
    private List<String> maengelListe;

    public Ware(String bezeichnung, double preis){
        this.bezeichnung=bezeichnung;
        this.preis=preis;
        besonderheitenListe = new ArrayList<String>();
        maengelListe= new ArrayList<String>();
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }

    public List<String> getBesonderheitenListe() {
        return besonderheitenListe;
    }

    public List<String> getMaengelListe() {
        return maengelListe;
    }

    @Override
    public String toString() {

        String text = "\nBezeichnung: \t" +getBezeichnung();
               text+= "\nBeschreibung: \t" +getBeschreibung();
               text+= "\nPreis: \t" +getPreis();
               text+= "\nBesonderhgeiten: \t" +getBesonderheitenListe();
               text+= "\nMängel: \t" +getMaengelListe();
        return text;
    }
}
