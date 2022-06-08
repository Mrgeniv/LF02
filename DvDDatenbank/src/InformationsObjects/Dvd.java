package InformationsObjects;

public class Dvd {
    private int nr;
    private String titel;
    private String hauptdarsteller;
    private String genre;
    private String jahr;
    private double preis;
    private int bewertung;
    private String aufloesung;
    private double dauer;

    /**
     * Konstruktor
     * @param titel Der Titel.
     * @param hauptdarsteller Der Hauptdarsteller.
     * @param genre Das Genre.
     * @param jahr Das Jahr.
     * @param preis Der Preis.
     * @param bewertung Die Bewertung.
     * @param aufloesung Die Auflösung.
     * @param dauer Die Dauer.
     */
    public Dvd (int nr,String titel,String hauptdarsteller, String genre, String jahr, double preis, int bewertung, String aufloesung, double dauer){
        this.nr=nr;
        this.titel=titel;
        this.hauptdarsteller=hauptdarsteller;
        this.genre=genre;
        this.jahr=jahr;
        this.preis=preis;
        this.bewertung=bewertung;
        this.aufloesung=aufloesung;
        this.dauer=dauer;

    }
    // getter & setter

    /**
     * Gibt die Nummer aus.
     * @return die Nummer.
     */
    public int getNr() {
        return nr;
    }

    /**
     * Aktualisiert die Nummer.
     * @param nr die neue Nmmer.
     */
    public void setNr(int nr) {
        this.nr = nr;
    }

    /**
     * Gibt den Titel aus.
     * @return den Titel.
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Aktualisiert den Titel.
     * @param titel den neuen Titel.
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * Gibt den Hauptdarsteller aus.
     * @return den Hauptdarsteller.
     */
    public String getHauptdarsteller() {
        return hauptdarsteller;
    }

    /**
     * Aktualisiert den Hauptdarsteller.
     * @param hauptdarsteller den neuen Hauptdarsteller.
     */
    public void setHauptdarsteller(String hauptdarsteller) {
        this.hauptdarsteller = hauptdarsteller;
    }

    /**
     * Gibt das Genre aus.
     * @return das Genre.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Aktualisiert das Genre.
     * @param genre das neue Genre.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gibt das Jahr aus.
     * @return das Jahr.
     */

    public String getJahr() {
        return jahr;
    }

    /**
     * Aktualisiert das Jahr.
     * @param jahr das neue Jahr.
     */
    public void setJahr(String jahr) {
        this.jahr = jahr;
    }

    /**
     * Gibt den Preis aus.
     * @return den Preis.
     */
    public double getPreis() {
        return preis;
    }

    /**
     * Aktualisiert den Preis.
     * @param preis den neuen Preis.
     */
    public void setPreis(double preis) {
        this.preis = preis;
    }

    /**
     * Gibt die Bewertung aus.
     * @return die Bewertung.
     */
    public int getBewertung() {
        return bewertung;
    }

    /**
     * Aktualisiert die Bewertung.
     * @param bewertung die neue Bewertung.
     */
    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }

    /**
     * Gibt die Dauer aus.
     * @return die Dauer.
     */
    public double getDauer() {
        return dauer;
    }

    /**
     * Aktualisiert die Dauer.
     * @param dauer die neue Dauer.
     */
    public void setDauer(double dauer) {
        this.dauer = dauer;
    }

    @Override
    public String toString() {
        String text = "Dvd: ";
        text += "\n\tNr: "+nr;
        text += "\n\tTitel: "+titel;
        text += "\n\tHauptdarsteller: "+hauptdarsteller;
        text += "\n\tGenre: "+genre;
        text += "\n\tJahr: "+jahr;
        text += "\n\tPreis:: "+preis;
        text += "\n\tBewertung: "+bewertung;
        text += "\n\tAuflösung: "+aufloesung;
        text += "\n\tDauer: "+dauer;
        return text;
    }
}


