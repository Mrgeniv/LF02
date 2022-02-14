public abstract class Konto {

    private  Kunde inhaber;
    private  double kontostand;
    private  double kreditlimit;
    private  double zinsguthaben;

    public Konto (Kunde inhaber, double kreditlimit, double zinsguthaben ){
        this.inhaber=inhaber;
        this.kontostand=kontostand;
        this.kreditlimit=kreditlimit;
        this.zinsguthaben=zinsguthaben;

    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public double getKreditlimit() {
        return kreditlimit;
    }

    public void setKreditlimit(double kreditlimit) {
        this.kreditlimit = kreditlimit;
    }

    public double getZinsguthaben() {
        return zinsguthaben;
    }

    public void setZinsguthaben(double zinsguthaben) {
        this.zinsguthaben = zinsguthaben;
    }

    public void einzahlen(double betrag){
        betrag += kontostand;
    }

    public boolean auszahlen(double betrag){
        if (kontostand +kreditlimit >= betrag){
            kontostand = kontostand - betrag;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "[Konto]" + super.toString()+
                "\n inhaber=" + inhaber +
                "\n kontostand=" + kontostand +
                "\n kreditlimit=" + kreditlimit +
                "\n zinsguthaben=" + zinsguthaben;
    }
}
