package oop.vererbung.zoo;

public class Fish extends Animal implements ISwimms {
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override 
    public String makeNoise() {
        return "Blubb!";
    }

    @Override 
    public void canSwim() {

    }
}
