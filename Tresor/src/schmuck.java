public class schmuck extends Gegenstand{

    private  String bezeichnung;



    public schmuck(int id, double wert, String bezeichnung) {
        super(id, wert);
        this.bezeichnung=bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public String toString() {
        return
                "Bezeichnung: " + bezeichnung + "\n";
    }
}
