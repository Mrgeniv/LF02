import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {

        Trainer trainer1 = new Trainer("Schaaf",50,8);
        Torwart torwart1 = new Torwart("Pavlenka",28,9,10,9);
        ArrayList<Spieler> spielerListe1 = new ArrayList<>();
        Mannschaft team1 = new Mannschaft("Werder Bremen", trainer1,torwart1,spielerListe1,0,0);
        System.out.println(team1);
        Spieler spieler1 = new Spieler("Klaaßen",27,7,7,10,10);
        spielerListe1.add(spieler1);
        spieler1 = new Spieler("Rashica",24,9,9,6,50);
        spielerListe1.add(spieler1);
        spieler1 = new Spieler("Mohammed",25,7,5,8,44);
        spielerListe1.add(spieler1);
        spieler1 = new Spieler("Jorve",18,9,9,10,60);
        spielerListe1.add(spieler1);
        spieler1 = new Spieler("Yannick",18,9,9,6,66);
        spielerListe1.add(spieler1);
        spieler1 = new Spieler("Abdul",21,10,7,7,20);
        spielerListe1.add(spieler1);
        spieler1 = new Spieler("Ubaida",17,6,7,6,19);
        spielerListe1.add(spieler1);


    }
}
