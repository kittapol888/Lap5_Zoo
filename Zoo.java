import Lib.*;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Lion"));
        animals.add(new Eagle("Eagle"));
        animals.add(new Penguin("Penguin"));
        animals.add(new Dolphin("Dolphin"));

        for(Animal animal: animals){
            System.out.println(animal.getName() + " says: " + animal.makeSound());
        }
        System.out.println();

        for(Animal animal:animals) {
            if (animal instanceof Flyable) {
                System.out.println(animal.getName() + " can fly: " + ((Flyable)animal).fly());
            } else if (animal instanceof Swimable) {
                System.out.println(animal.getName() + " can swim: " + ((Swimable)animal).swim());
            }else {
                System.out.println(animal.getName() + " can walk.");
            }
        }
    }
}
