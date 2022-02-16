public class Girokonto extends Konto {
    private double zinsKredit;

    public Girokonto(Kunde inhaber, double kreditlimit,double zinsguthaben, double zinsKredit ){
        super(inhaber, kreditlimit, zinsguthaben);
        this.zinsKredit=zinsKredit;

    }

    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }

    public boolean ueberweisen(double betrag, Girokonto girokonto){
        if (auszahlen(betrag)){
            girokonto.einzahlen(betrag);
            System.out.println(girokonto);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "[Girokonto]" + super.toString() +
                "\n ZinsKredit=" + zinsKredit;
    }
}
