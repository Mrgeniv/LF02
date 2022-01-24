/**
 * a) Unterklasse/Subklasse der Klasse obstMA21.Obst
 * b) VERERBUNG: erbt, also kennt alle Attribute und Methoden die
 * die Oberklasse/Superklasse obstMA21.Obst hat und kann diese ebenfalls verwenden
 * (hat allerdings nur auf öffentliche(!) Attribute und Methoden von obstMA21.Obst
 * direkten Zugriff)
 * c) Die Vererbung wird durch das Schlüsselwort EXTENDS ausgelöst
 */

public class Apfel  extends Obst {

    /**
     * Konstruktor der Klasse obstMA21.Apfel
     */
    public Apfel() {
        /**
         * Mit super wird hier der Konstruktor der Oberklasse obstMA21.Obst
         * aufgerufen und der Wert für das Attribut name übergeben.
         */
        super("Apfel");
    }

}