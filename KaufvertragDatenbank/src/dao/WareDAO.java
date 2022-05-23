package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.nio.charset.StandardCharsets;
import java.sql.*;

public class WareDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragDatenbank/src/data/Kaufvertrag.db";

    public WareDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }
    /**
     * Liest einen Vertragspartner auf Basis einer Warennummer
     * @param warenNr Die Warennummer
     * @return Der geünschte Vertragspartner
     */
    public Ware read(int warenNr) {
        Ware ware = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        // Verbing zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM Ware WHERE warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, warenNr);

            // SQL-Abfrage ausführen
            ResultSet resultSet= preparedStatement.executeQuery();

            // Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            //Resultset auswerten
            warenNr = resultSet.getInt("WarenNr");
            String bezeichnung = resultSet.getString("bezeichnung");
            String beschreibung = resultSet.getString("beschreibung");
            double preis = resultSet.getDouble("Preis");
            String besonderheiten = resultSet.getString("besonderheiten");
            String maengel = resultSet.getString("maengel");

            //ware erstellen
            ware = new Ware(bezeichnung,preis);
            ware.setBeschreibung(beschreibung);
            ware.setWarenNr(warenNr);
            if (besonderheiten!= null){
                String[] besonderheitenArray = besonderheiten.split(";");
                for (String besonderheit: besonderheitenArray){
                    ware.getBesonderheitenListe().add(besonderheit.trim());
                }
            }
            if (maengel != null){
                String[] maengelArray = maengel.split(";");
                for (String maengeln: maengelArray){
                    ware.getMaengelListe().add(maengeln.trim());
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }  finally {
            try {
                preparedStatement.close();
            } catch (SQLException e){
                e.printStackTrace();
            } finally {
                try{
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            return ware;
        }
    }

}
