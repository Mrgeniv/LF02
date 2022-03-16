import javax.management.MBeanAttributeInfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgrammCSVread {

    private static void erstelleCSV(Kaufvertrag kaufvertrag) throws IOException {

        String datei = "H:/LF02/Kaufvertrag/src/Kaufvertrag.csv";
        BufferedReader br = new BufferedReader(new FileReader(datei));

        String zeile;
        String [] array;
        while ((zeile = br.readLine()) != null){
            array= zeile.split(";");

            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + " | ");
            }
            System.out.println();
        }
    }
}
