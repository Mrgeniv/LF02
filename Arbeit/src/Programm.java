import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {

        Trainer trainer1 = new Trainer("Schaaf",50,8);
        Torwart torwart1 = new Torwart("Pavlenka",28,9,10,9);
        ArrayList<Spieler> spielerListe1 = new ArrayList<~>();
        Spieler spieler1 = new Spieler("Klaaßen",27,7,7,10,10);
        spielerListe1.add(spieler1);
        spieler1 = new Spieler("Rashica",24,9,9,6,50);
        spielerListe1.add(spieler1);
        Mannschaft team1 = new Mannschaft("Werder All Stars", trainer1,torwart1,spielerListe1,);

    }
}
