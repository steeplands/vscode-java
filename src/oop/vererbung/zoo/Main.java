package oop.vererbung.zoo;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Birb", 1, 1.5);
        Dog dog = new Dog("Bello", 5, 10);
        Duck duck = new Duck("Kurzgesagt Duck", 4, 2.11);
        Fish fish = new Fish("Nemo", 24, 0.2);

        Zoo zoo = new Zoo(5);

        zoo.addAnimal(bird);
        zoo.addAnimal(dog);
        zoo.addAnimal(duck);
        zoo.addAnimal(fish);

        System.out.println("\nInfo:");
        zoo.printAllInfo();

        System.out.println("\nNoise:");
        zoo.printAllNoise();

        System.out.println("\nSwimming:");
        zoo.printAllSwimming();

        System.out.println("\nFlying:");
        zoo.printAllFlying();

        System.out.println("\nMove:");
        zoo.moveAnimal(bird);
        zoo.moveAnimal(dog);
        zoo.moveAnimal(duck);
        zoo.moveAnimal(fish);
    }
}
