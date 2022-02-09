public class Elfe extends Spielfigur {


    public Elfe(String name, int stearkepunkte) {
        super(name, stearkepunkte);
    }

    public void rennen() throws KeineKraftException{
       if (setStearkepunkte()-2 >= 0){
           setStearkepunkte(getStearkepunkte()-2);
           System.out.println(getName()+" rennt.");
       }
    }


    @Override
    public String toString() {

        String text = "\n\tName = " + getName();
        text += "\n\tStearkepunkte = " + getStearkepunkte();

        return text;
    }
}
