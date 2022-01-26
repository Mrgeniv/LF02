public class Spiel {

    private String name;
    private Mannschaft Heim;
    private Mannschaft Gast;
    private Ergebnis ergebnis;
    private StringBuilder spielverlauf;

    public Spiel(Mannschaft Heim, Mannschaft Gast){

    }

    public Mannschaft getHeim() {
        return Heim;
    }

    public Mannschaft getGast() {
        return Gast;
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielverlauf() {
        return spielverlauf;
    }
    @Override
    public String toString() {
        String text = "Name = " + name ;
        text += "\n\tMannschaft Heim = " + Heim ;
        text += "\n\tMAnnschaft Gast = " + Gast ;
        text += "\n\tErgebnis = " + ergebnis;
        text += "\n\tSpielverlauf = " + spielverlauf;

        return text;

    }

}
