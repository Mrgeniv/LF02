public abstract class Person {

    private String Name;
    private int Alter;

    public Person(String name, int alter, int Alter){
        this.Name=name;
        this.Alter=Alter;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setAlter(int Alter){
        this.Alter=Alter;
    }

    public int getAlter() {
        return Alter;
    }

    @Override
    public  String toString(){
        String text = "Name = " + Name;
        text += "\n\tAlter = " + Alter;

        return text;

    }
}
