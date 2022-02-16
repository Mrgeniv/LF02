public class Programm {

    public static void main(String[] args) {

        Mitarbeiter jorve = new Mitarbeiter("Jorve","Zimmermann");
        Kunde Mika = new Kunde("Mika","König", jorve);
        Adresse jorveAdresse = new Adresse("Hollenderstraße","30","28205","Bremen");
        jorve.setAdresse(jorveAdresse);
        Sparkonto sparkonto1 = new Sparkonto(Mika,0);

        System.out.println(sparkonto1);
        sparkonto1.einzahlen(100.000);


    }
}
