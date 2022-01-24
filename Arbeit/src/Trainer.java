public class Trainer extends Person {

    private String Name;
    private int Alter;
    private  int erfahrung;

    public Trainer(String name, int Alter, int erfahrung) {
        super(name, Alter, erfahrung);
    }


    /**
     * Getter setter
     */

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAlter (int alter){
        this.Alter = Alter;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }

    public String getName() {
        return Name;
    }

    public int getAlter() {
        return Alter;
    }

    public int getErfahrung() {
        return erfahrung;
    }

    @Override
    public  String toString(){
        String text = "Name = " + Name;
        text += "\n\tAlter = " + Alter;
        text += "\n\tErfahrung = " + erfahrung;

        return text;

    }
}
