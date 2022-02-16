public class Sparkonto extends Konto {

    public Sparkonto(Kunde inhaber, double zinsguthaben){
        super(inhaber,0,zinsguthaben);
    }

    @Override
    public String toString() {
        return " [Sparkonto]" +super.toString();
    }
}
