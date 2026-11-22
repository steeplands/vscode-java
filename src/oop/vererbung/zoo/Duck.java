package oop.vererbung.zoo;

public class Duck extends Animal implements IFlys, ISwimms {
    public Duck(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override 
    public String makeNoise() {
        return "Quack!";
    }

    @Override 
    public boolean canFly() {
        return true;
    }

    @Override 
    public void canSwim() {

    }
}
