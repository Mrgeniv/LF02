public abstract class Obst {

    String name;
    String farbe;
    double gewicht;
    boolean reif;

    //Konstruktor
    public Obst(String name){
        this.name = name;
    }


    //Getter
    public String getFarbe(){
        return  farbe;
    }

    public String getName(){
        return name;
    }

    //Setter
    public void setFarbe(String farbe){
        this.farbe = farbe;
    }

    public  double getGewicht(){
        return  gewicht;
    }

    public void  setGewicht(double gewicht){
        this.gewicht=gewicht;
    }

    public  boolean isReif(){
        return reif;
    }

    public void setReif(boolean reif) {
        this.reif = reif;
    }
}
