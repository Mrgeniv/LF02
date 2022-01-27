package Schritt1;

public class Torwart extends Spieler{
    private int reaktion;

    public Torwart(String name, int alter, int stearke, int motivation, int reaktion){
        super(name , alter , stearke,0,motivation,0);
        this.reaktion= reaktion;

    }

    public int getReaktion() {
        return reaktion;
    }

    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }
}
