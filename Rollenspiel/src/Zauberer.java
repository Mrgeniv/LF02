public class Zauberer extends Spielfigur {

    private int zauberpunkte;

    public Zauberer(String name, int stearkepunkte, int zauberpunkte){
        super(name, stearkepunkte );
        this.zauberpunkte=zauberpunkte;


    }

    public int getZauberpunkte() {
        return zauberpunkte;
    }

    public void trinkenZaubertrank(){

    }

    public  void zaubern(){

    }

    @Override
    public String toString() {
        String text = "\n\tName = " + getName();
        text += "\n\tStearkepunkte = " + getStearkepunkte();
        text += "\n\tZauberpunkte = " + getZauberpunkte();


        return text;
    }
}
