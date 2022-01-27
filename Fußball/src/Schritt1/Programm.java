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

        System.out.println(team1);
        System.out.println(trainer1);
        System.out.println(torwart1);
        System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~>");
        System.out.println(spielerListe1);
        System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~>");


        Trainer trainer2 = new Trainer("Mika",44,8);
        Torwart torwart2 = new Torwart("Lucas",23,9,10,9);
        ArrayList<Spieler> spielerListe2 = new ArrayList<>();
        Mannschaft team2 = new Mannschaft("Bayern München", trainer1,torwart1,spielerListe1,0,0);
        Spieler sp1 = new Spieler("Lukas",24,6,5,10,11);
        Spieler sp2 = new Spieler("Achmed",24,9,9,6,5);
        Spieler sp3 = new Spieler("Noah",28,7,3,8,16);
        Spieler sp4 = new Spieler("Chan",22,9,5,10,20);
        Spieler sp5 = new Spieler("Boris",19,0,0,3,0);
        Spieler sp6 = new Spieler("Lucas",23,6,2,5,21);
        Spieler sp7 = new Spieler("Aaron",19,6,7,6,19);


        spielerListe1.add(sp1);
        spielerListe1.add(sp2);
        spielerListe1.add(sp3);
        spielerListe1.add(sp4);
        spielerListe1.add(sp5);
        spielerListe1.add(sp6);
        spielerListe1.add(sp7);

        System.out.println(team2);
        System.out.println(trainer2);
        System.out.println(torwart2);
        System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~>");


    }
}
