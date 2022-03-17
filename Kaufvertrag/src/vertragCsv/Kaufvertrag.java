package vertragCsv;

import java.io.FileNotFoundException;

public class Kaufvertrag {


    private Vertragspartner verkaeufer;

    private Vertragspartner kaeufer;

    private Ware ware;

    private String zahlungsModalitaeten;

    public Kaufvertrag(Vertragspartner verkaeufer, Vertragspartner kaeufer, Ware ware) throws FileNotFoundException {
        this.verkaeufer=verkaeufer;
        this.kaeufer=kaeufer;
        this.ware=ware;

    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlungsModalitaeten() {
        return zahlungsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlungsModalitaeten) {
        this.zahlungsModalitaeten = zahlungsModalitaeten;
    }

    @Override
    public String toString() {
        String text = "\nKAUFVERTRAG \t";
               text+="\nVERKÄUFER: \t" + getVerkaeufer();
               text+="\nADRESSE: \t" + getKaeufer();
               text+="\nWare: \t" + getWare();
               text+="\nZahlungsmodalitäten: \t" + getZahlungsModalitaeten();
               return text;

    }
}
