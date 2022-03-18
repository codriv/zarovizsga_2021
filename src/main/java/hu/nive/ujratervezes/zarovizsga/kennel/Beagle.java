package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{

    public Beagle(String name) {
        super(name);
        increaseHappiness = 2;
        multiply = 2;
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
