package Schritt1;

public abstract class Person {

    private String Name;
    private int Alter;

    public Person(String name, int Alter){
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
        String text = "\n\tName = " + getName();
        text += "\n\t"+ "Alter = " + getAlter();

        return text;

    }
}
