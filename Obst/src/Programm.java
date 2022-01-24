public class Programm {

    public static void main(String[] args) {
        /**
         * Anlegen einer Instanz apfel1, also eines Objekts apfel1 der Klasse obstMA21.Apfel:
         * 1. Links vom Gleichheitszeichen: Deklaration der Objektvariablen apfel1 --> Datentyp ist obstMA21.Apfel
         * 2. Rechts vom Gleichheitszeichen: Mit new obstMA21.Apfel() wird das neue Objekt erzeugt, indem der
         * Konstruktor der Klasse obstMA21.Apfel aufgerufen wird. Dabei werden die Werte für die drei Parameter übergeben.
         */
        Apfel apfel1 = new Apfel();
        apfel1.setFarbe("grün");
        apfel1.setGewicht(250);
        apfel1.setReif(true);

        /**
         * Der Getter getName() wird für das Objekt apfel1 aufgerufen.
         * Dieser Getter ist zwar nicht in der Klasse obstMA21.Apfel deklariert, aber
         * in dessen Oberklasse obstMA21.Obst.
         */
        System.out.println(apfel1.getName());
        System.out.println(apfel1.getGewicht());

        Banane banane1 = new Banane();
        System.out.println(banane1.getName());

        /**
         * Anlegen einer zweiten Instanz der Klasse obstMA21.Apfel, die apfelNeu genannt wird:
         */
        Apfel apfelNeu = new Apfel();
        System.out.println(apfelNeu.getName());

    }
}
