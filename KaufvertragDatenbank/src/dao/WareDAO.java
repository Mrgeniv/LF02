package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;

public class WareDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragDatenbank/src/data/Kaufvertrag.db";
    private Connection connection;

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
        connection = null;
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
            ware=createObject(resultSet);
            return ware;

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

    public ArrayList<Ware> read(){


        ArrayList<Ware> warenListe= null;
        connection = null;
        PreparedStatement preparedStatement= null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * FROM ware";
            preparedStatement=connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();
            warenListe = new ArrayList<>();

            while (resultSet.next()){
                Ware ware = createObject(resultSet);
                warenListe.add(ware);
            }


        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }

        }

        return warenListe;
    }

    private Ware createObject(ResultSet resultSet) throws SQLException{

        int warenNr = resultSet.getInt("WarenNr");
        String bezeichnung = resultSet.getString("bezeichnung");
        String beschreibung = resultSet.getString("beschreibung");
        double preis = resultSet.getDouble("Preis");
        String besonderheiten = resultSet.getString("besonderheiten");
        String maengel = resultSet.getString("maengel");
        Ware ware = new Ware(bezeichnung,preis);

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
        ware.setBeschreibung(beschreibung);
        ware.setWarenNr(warenNr);
        return ware;
    }

    public void delete(int warenNr){
        connection= null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            String sql = "DELETE FROM ware WHERE warenNr=?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,warenNr);

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            }catch (SQLException e){
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

    }

}

    private  void update(int warenNr, String bezeichnung, String beschreibung){
        connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection= DriverManager.getConnection(CONNECTIONSTRING);

            String sql = "UPDATE Ware SET warenNr =?, bezeichnung=? , beschreibung=? ";
            preparedStatement =connection.prepareStatement(sql);

            preparedStatement.setInt(1,warenNr);
            preparedStatement.setString(2,bezeichnung);
            preparedStatement.setString(3,beschreibung);
            preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            }catch (SQLException e){
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }

    private void insertInto(int warenNr,String bezeichnung,String beschreibung,double preis,String besonderheiten,String maengel){
        connection = null;
        PreparedStatement preparedStatement = null;


        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "INSERT INTO vertragspartner VALUES (?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, warenNr );
            preparedStatement.setString(2, bezeichnung);
            preparedStatement.setString(3, beschreibung);
            preparedStatement.setDouble(4, preis);
            preparedStatement.setString(5, besonderheiten);
            preparedStatement.setString(6, maengel);
            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();

        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
