package hu.nive.ujratervezes.zarovizsga.kennel;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        dogs.forEach(Dog::feed);
    }

    public Dog findByName(String name) {
        List<Dog> dogFound = dogs.stream().filter(dog -> name.equals(dog.getName())).collect(Collectors.toList());
        if (dogFound.isEmpty()) {
            throw new IllegalArgumentException("Dog not found!");
        }
        return dogFound.get(0);
    }

    public void playWith(String name, int hours) {
        findByName(name).play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        return dogs.stream().filter(dog -> minHappiness < dog.getHappiness()).map(Dog::getName).collect(Collectors.toList());
    }
}
