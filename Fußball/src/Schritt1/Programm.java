package Schritt1;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {

        Trainer trainer1 = new Trainer("Schaaf",50,8);
        Torwart torwart1 = new Torwart("Pavlenka",28,9,10,9);
        ArrayList<Spieler> spielerListe1 = new ArrayList<>();
        Mannschaft team1 = new Mannschaft("Werder Bremen", trainer1,torwart1,spielerListe1,0,0);
        Spieler spieler1 = new Spieler("Klaaßen",27,7,7,10,10);
        Spieler spieler2 = new Spieler("Rashica",24,9,9,6,50);
        Spieler spieler3 = new Spieler("Mohammed",25,7,5,8,44);
        Spieler spieler4 = new Spieler("Jorve",18,9,9,10,60);
        Spieler spieler5 = new Spieler("Yannick",18,9,9,6,66);
        Spieler spieler6 = new Spieler("Abdul",21,10,7,7,20);
        Spieler spieler7 = new Spieler("Ubaida",17,6,7,6,19);


        spielerListe1.add(spieler1);
        spielerListe1.add(spieler2);
        spielerListe1.add(spieler3);
        spielerListe1.add(spieler4);
        spielerListe1.add(spieler5);
        spielerListe1.add(spieler6);
        spielerListe1.add(spieler7);


    }
}
