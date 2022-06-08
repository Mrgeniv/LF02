import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.VertragspartnerDAO;
import dao.WareDAO;


import java.sql.SQLException;
import java.util.ArrayList;



public class programm {

    public static void main(String[] args) throws ClassNotFoundException {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        WareDAO wareDAO = new WareDAO();
        Vertragspartner vertragspartner = vertragspartnerDAO.read("0123456789");
        System.out.println(vertragspartner);
        vertragspartnerDAO.update("sf464","hofenmann","5a");
        vertragspartnerDAO.insertInto(vertragspartnerDAO.insertInto(vertragspartner));
        System.out.println(vertragspartnerDAO.read("1"));
        vertragspartnerDAO.delete("1");

        System.out.println("---------------------------------------------------");
        ArrayList<Vertragspartner> vertragspartnerListe = vertragspartnerDAO.read();
        for (Vertragspartner v: vertragspartnerListe) {
            System.out.println(v);
        }
        System.out.println("-------------------------------------------------------");
        Ware ware = new WareDAO().read(1);
        System.out.println(ware);
        ArrayList<Ware> wareListe = new WareDAO().read();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(wareListe);
        System.out.println("super!!!!");
    }
}