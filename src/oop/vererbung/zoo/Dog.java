package oop.vererbung.zoo;

public class Dog extends Animal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override 
    public String makeNoise() {
        return "Wuff!";
    }
}
