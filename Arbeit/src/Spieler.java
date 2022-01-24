public class Spieler {

    private String Name;
    private int Alter;
    private int stearke;
    private int torschuss;
    private int motivation;
    private int tore;


    public Spieler(String name, int alter, int stearke, int torschuss, int motivation, int tore ) {
        this.Name=name;
        this.Alter=alter;
        this.stearke=stearke;
        this.torschuss=torschuss;
        this.motivation=motivation;
        this.tore=tore;
    }



    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setAlter(int Alter){
        this.Alter=Alter;
    }

    public int getAlter() {
        return Alter;
    }

    public void setStearke(int stearke) {
        this.stearke = stearke;
    }

    public int getStearke() {
        return stearke;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }

    public int getTore() {
        return tore;
    }

    @Override
    public  String toString(){
        String text = "Name = " + Name;
        text += "\n\tAlter = " + Alter;
        text += "\n\tStärke = " + stearke;
        text += "\n\tTorschuss = " + torschuss;
        text += "\n\tMotivation = " + motivation;
        text += "\n\tTore = " + tore;

        return text;

    }

}
