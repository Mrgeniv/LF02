package einlesenDatein;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class einlesenCsv {
    //einlesen von Csv-Datei

    public static void main(String[] args) throws IOException {
        String datei = "H:/LF02/Kaufvertrag/src/Kaufvertrag.csv";
        BufferedReader br= new BufferedReader(new FileReader(datei));

        String zeile;
        while ((zeile = br.readLine()) != null){
            String[] datensatz = zeile.split(";");
            if (datensatz[0].equalsIgnoreCase("Käufer")){
                String[] name = datensatz [1].split(", ");
                String[] strassenHausNr = datensatz [2].split(" ");
                String hausNr = strassenHausNr[strassenHausNr.length-1];
                String strasse = "";

                for (int i = 0; i < strassenHausNr.length-1; i++){
                    strasse += strassenHausNr[i] + " ";
                }
                strasse = strasse.trim();
                String[] plzOrt =datensatz[3].split(" ");
                String plz = plzOrt[0];
                String ort = "";
                for (int i = 1; plzOrt.length; i++){

                }

            }


        }


    }

}
