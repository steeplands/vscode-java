package oop.vererbung.zoo;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {return this.name;}
    public int getAge() {return this.age;}
    public double getWeight() {return this.weight;}

    public void eat(double ammount) {
        this.weight += ammount;
    }

    public abstract String makeNoise();

    public String infoToString() {
        return "Name: " + this.name + " - Age: " + this.age + " - Weight: " + this.weight;
    }
}
