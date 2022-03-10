public class aktie extends Gegenstand{

    private String unternehmen;
    public double nennwert;


    public aktie(int id, double wert, String unternehmen, double nennwert) {
        super(id, wert);
        this.unternehmen= unternehmen;
        this.nennwert= nennwert;

    }

    public String getUnternehmen() {
        return unternehmen;
    }

    public void setUnternehmen(String unternehmen) {
        this.unternehmen = unternehmen;
    }

    public double getNennwert() {
        return nennwert;
    }

    public void setNennwert(double nennwert) {
        this.nennwert = nennwert;
    }

    @Override
    public String toString() {

        return "\n[aktie]" + "\n" +
                "Unternehmen: " + unternehmen + "\n" +
                "Nennwert: " + nennwert;
    }
}
