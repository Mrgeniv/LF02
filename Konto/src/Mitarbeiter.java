public class Mitarbeiter extends Person {

    public Mitarbeiter(String vorname, String nachname ){
        super(vorname,nachname);
    }

    @Override
    public String toString() {

        return  "\n Vorname: " + getVorname() +
                "\n Nachname: " + getNachname() +
                "\n Adresse: " + getAdresse();
    }
}
