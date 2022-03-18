package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {

    protected String name;
    protected int happiness;
    protected int increaseHappiness ;
    protected int multiply;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public abstract void feed();

    public abstract void play(int hours);
}
