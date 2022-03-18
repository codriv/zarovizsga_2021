package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog{

    public Husky(String name) {
        super(name);
        INCREASE_HAPPINESS = 4;
        MULTIPLY = 3;
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
