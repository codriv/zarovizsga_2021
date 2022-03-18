package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{

    public Beagle(String name) {
        super(name);
        INCREASE_HAPPINESS = 2;
        MULTIPLY = 2;
    }

    @Override
    public void feed() {
        happiness += INCREASE_HAPPINESS;
    }

    @Override
    public void play(int hours) {
        happiness += hours * MULTIPLY;
    }
}
