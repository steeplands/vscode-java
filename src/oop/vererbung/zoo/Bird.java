package oop.vererbung.zoo;

public class Bird extends Animal implements IFlys {
    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override 
    public String makeNoise() {
        return "Piep!";
    }

    @Override 
    public boolean canFly() {
        return true;
    }
}
