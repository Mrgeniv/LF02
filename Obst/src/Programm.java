public class Programm {


    public static void main(String[] args) {
        Apfel apfel = new Apfel();
        apfel.setFarbe("grün");
        apfel.setGewicht(250);
        apfel.setReif(true);

        System.out.println(apfel.name);
        System.out.println(apfel.gewicht);

        Banane banane = new Banane();
        System.out.println(banane.getName());

    }
}
