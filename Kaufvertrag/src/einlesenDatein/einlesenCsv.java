package einlesenDatein;

import vertragCsv.Adresse;
import vertragCsv.Vertragspartner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class einlesenCsv {
    //einlesen von Csv-Datei

    public static void main(String[] args) throws IOException {
        String datei = "H:/LF02/Kaufvertrag/src/Kaufvertrag.csv";
        BufferedReader br= new BufferedReader(new FileReader(datei));

        String zeile;
        String vornameK = null;
        String nachnameK = null;

        String vornameV = null;
        String nachnameV = null;

        while ((zeile = br.readLine()) != null){

            String[] datensatz = zeile.split(";");
            if (datensatz[0].equalsIgnoreCase("Kaeufer")){

                String[] name = datensatz [1].split(" ");
                Adresse adresse = erstellenStrassenHausNr(datensatz);
                vornameK = name[0];
                nachnameK = name[1];
            }
        }

        while ((zeile = br.readLine()) != null){
            String[] datensatz2 = zeile.split(";");
            if (datensatz2[0].equalsIgnoreCase("Verkäufer")){
                String[] name = datensatz2 [1].split(" ");
                Adresse adresse = erstellenStrassenHausNr(datensatz2);
                vornameV = name[0];
                nachnameV = name[1];

            }
        }
        Vertragspartner kaeufer = new Vertragspartner(vornameK,nachnameK);
        Vertragspartner verkaeufer = new Vertragspartner(vornameV, nachnameV);
        Adresse adresse = erstellenStrassenHausNr(null);
        System.out.println(kaeufer);
        System.out.println(verkaeufer);

    }
    private static Adresse erstellenStrassenHausNr(String[] datensatz){

        String[] strassenHausNr = datensatz [2].split(" ");
        String hausNr = strassenHausNr[strassenHausNr.length-1];
        String strasse = "";

        for (int i = 0; i < strassenHausNr.length-1; i++){
            strasse += strassenHausNr[i] + " ";
        }
        strasse = strasse.trim();
        String plz = datensatz[3];
        String ort = datensatz[4];
        Adresse adresse = new Adresse(strasse,hausNr,plz,ort);

        return adresse;
    }

}
