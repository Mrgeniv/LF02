public class GegenstandNichtGefundenExeption extends Exception {
    private int id;

    public GegenstandNichtGefundenExeption(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }
    public  String getMessage(){
        return "Der Gegenstand mit der ID ["+id+"] wurde nicht gefunden";

    }
}
