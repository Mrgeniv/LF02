package dao;

import InformationsObjects.Dvd;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.sql.*;
import java.util.ArrayList;

public class dvdDao {

    private final String CLASSNAME= "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:DvDDatenbank/src/data/Dvd.db";
    private Connection connection;

    public dvdDao()throws ClassNotFoundException{
        Class.forName(CLASSNAME);
    }
    public Dvd read(String nr){
        Dvd dvd = null;
        connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            String sql = "SELECT * FROM  Dvd where Nr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,nr);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            dvd=createOject(resultSet);

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e ){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return dvd;
    }

    public ArrayList<Dvd> read(){
        connection= null;
        ArrayList<Dvd> dvdArrayList = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            String sql = "SELECT * FROM Dvd";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            Dvd dvd = null;

            while (resultSet.next()){
                dvd = createOject(resultSet);
                dvdArrayList.add(dvd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return dvdArrayList;

    }

    public void delete (String nr){
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            String sql = "DELETE FROM Dvd where Nr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,nr);

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
                }catch (SQLException e ){
                    e.printStackTrace();
                }
            }
        }
    }

    public Dvd insertInto(Dvd dvd){
        connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "INSERT INTO Dvd (nr,titel,hauptdarsteller,genre,jahr,preis,bewertung,auflösung,dauer) VALUES (?,?,?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,dvd.getNr());
            preparedStatement.setString(2,dvd.getTitel());
            preparedStatement.setString(3,dvd.getHauptdarsteller());
            preparedStatement.setString(4, dvd.getGenre());
            preparedStatement.setString(5,dvd.getJahr());
            preparedStatement.setDouble(6,dvd.getPreis());

        }catch (SQLException e){
            e.printStackTrace();
        }
        return dvd;
    }

    private Dvd createOject(ResultSet resultSet) throws SQLException {
        int nr = resultSet.getInt("Nr");
        String titel = resultSet.getString("titel");
        String hauptdarsteller = resultSet.getString("hauptdarsteller");
        String genre = resultSet.getString("genre");
        String jahr = resultSet.getString("jahr");
        double preis = resultSet.getDouble("preis");
        int bewertung = resultSet.getInt("bewertung");
        String aufloesung = resultSet.getString("auflösung");
        double dauer = resultSet.getDouble("dauer");

        Dvd dvd = new Dvd(nr,titel,hauptdarsteller,genre,jahr,preis,bewertung,aufloesung,dauer);

        return dvd;
    }


}
