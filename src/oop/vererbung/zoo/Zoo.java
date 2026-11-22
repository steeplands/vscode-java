package oop.vererbung.zoo;

public class Zoo {
    private Animal[] animals;

    public Zoo(int size) {
        this.animals = new Animal[size];
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] == null) {
                this.animals[i] = animal;
                return true;
            }
        }
        return false;
    }

    public void printAllInfo() {
        for (Animal animal : this.animals) {
            if (animal != null) {
                System.out.println(animal.infoToString());
            }
        }
    }

    public void printAllNoise() {
        for (Animal animal : this.animals) {
            if (animal != null) {
                System.out.println(animal.makeNoise());
            }
        }
    }
    
    public void printAllSwimming() {
        for (Animal animal : this.animals) {
            if (animal instanceof ISwimms) {
                System.out.println(animal.getName());
            }
        }
    }

    public void printAllFlying() {
        for (Animal animal : this.animals) {
            if (animal instanceof IFlys) {
                System.out.println(animal.getName());
            }
        }
    }
}
