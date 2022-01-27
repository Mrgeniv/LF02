package Schritt1;

public class Trainer extends Person {

    private  int erfahrung;

    public Trainer(String name, int Alter, int erfahrung) {
        super(name, Alter);
        this.erfahrung=erfahrung;
    }

    public int getErfahrung() {
        return erfahrung;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }



    @Override
    public  String toString(){
        String text =""+ getName();
        text += "\n\t" + "Alter = " + getAlter();
        text += "\n\t" + "Erfahrung =" + erfahrung;

        return text;

    }
}
