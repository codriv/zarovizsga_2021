package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog{

    public Husky(String name) {
        super(name);
        increaseHappiness = 4;
        multiply = 3;
    }

    @Override
    public void feed() {
        happiness += increaseHappiness;
    }

    @Override
    public void play(int hours) {
        happiness += hours * multiply;
    }
}
