public abstract class Spielfigur {

    private String name;
    private int stearkepunkte;

    public Spielfigur(String name, int stearkepunkte ){

        this.name=name;
        this.stearkepunkte=stearkepunkte;
    }



    public int getStearkepunkte() {
        return stearkepunkte;
    }

    public void setStearkepunkte(int stearkepunkte) {
        this.stearkepunkte = stearkepunkte;
    }

    public String getName() {
        return name;
    }

    protected int setStearkepunkte(){
        return stearkepunkte;
    }

    public void essen(){
        stearkepunkte +=stearkepunkte+10;
    }

    public void laufen(){
        stearkepunkte +=stearkepunkte-1;
    }

    public void klettern() {
        stearkepunkte +=stearkepunkte-1;
    }

    public void Kämpfen(){
        stearkepunkte+=stearkepunkte-3
    }



    @Override
    public String toString() {
       String text = "\n\tName = " + getName();
       text += "\n\tStearkepunkte = " + getStearkepunkte();


       return text;
    }
}
