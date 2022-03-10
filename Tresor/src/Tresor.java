import java.util.ArrayList;

public class Tresor  {


    private ArrayList<Gegenstand> gegenstaende;


    public Tresor(){
        gegenstaende = new ArrayList<Gegenstand>();

    }


    public Gegenstand getGegenstaende(int id) throws GegenstandNichtGefundenExeption {
        for (Gegenstand g : gegenstaende){
            if (g.getId() == id){
                return g;
            }
        }
        throw new GegenstandNichtGefundenExeption(id);
    }
    public void addGegenstand(Gegenstand gegenstand){
        gegenstaende.add(gegenstand);
    }

    public void removeGegenstand(Gegenstand gegenstand){
        gegenstaende.remove(gegenstand);
    }

    public double berechneGesamtwert(){
        double gesamtwert = 0;
        for (Gegenstand g: gegenstaende){
            g.getWert();
            gesamtwert += g.getWert();
        }
        return gesamtwert;
    }

    @Override
    public String toString() {

        String text = "\nListe der Gegenstände";

        for(Gegenstand g: gegenstaende){
            text += "\n" + g.toString();
        }
        return text;
    }

}
