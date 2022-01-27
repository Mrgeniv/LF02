package Schritt1;

import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerArrayList;
    private int motivation;
    private int motivationMittelwert;
    private int stearke;
    private int stearkeMittelwert;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerArrayList, int motivation, int stearke) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerArrayList = spielerArrayList;
        this.motivation = motivation;
        this.stearke = stearke;
    }

    public String getName() {
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public ArrayList<Spieler> getSpielerArrayList() {
        return spielerArrayList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public void setSpielerArrayList(ArrayList<Spieler> spielerArrayList) {
        this.spielerArrayList = spielerArrayList;
    }

    public int getMotivation() {
        for (Spieler s : spielerArrayList) {
            motivation += s.getMotivation();
        }

        motivation += torwart.getMotivation();
        motivationMittelwert = motivation / (spielerArrayList.size() + 1);
        return motivationMittelwert;
    }

    public int getStearke() {
        for (Spieler s : spielerArrayList) {
            stearke += s.getStearke();

        }
        stearke += torwart.getMotivation();
        stearkeMittelwert = stearke / (spielerArrayList.size() + 1);
        return stearkeMittelwert;
    }

    @Override
    public String toString() {
        String text = "\n\t" + name;
        text += "\n\tSchritt1.Trainer = " + trainer;
        text += "\n\tSchritt1.Torwart = " + torwart;
        text += "\n\tSchritt1.Spieler = " + getSpielerArrayList();
        text += "\n\tMotivation = " + motivation;
        text += "\n\tMannschaffts Motivation = " + motivationMittelwert;
        text += "\n\tStärke = " + stearke;
        text += "\n\tMannschaffts Stärke = " + motivationMittelwert;

        return text;

    }

}