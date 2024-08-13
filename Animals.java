// Superclass: Animal
class Animal {
    // Method to be overridden by subclasses
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass: Herbivores
class Herbivores extends Animal {
    @Override
    public void eat() {
        System.out.println("Herbivores eat plants.");
    }
}

// Subclass: Carnivores
class Carnivores extends Animal {
    @Override
    public void eat() {
        System.out.println("Carnivores eat meat.");
    }
}

// Subclass: Omnivores
class Omnivores extends Animal {
    @Override
    public void eat() {
        System.out.println("Omnivores eat both plants and meat.");
    }
}

// Main class to demonstrate method overriding
public class Animals {
    public static void main(String[] args) {
        // Create an array of Animal references
        Animal[] animals = new Animal[3];

        // Instantiate the subclasses and assign them to the array
        animals[0] = new Herbivores();
        animals[1] = new Carnivores();
        animals[2] = new Omnivores();

        // Iterate through the array and call the eat method
        for (Animal animal : animals) {
            animal.eat();
            System.out.println();  // For better readability
        }
    }
}


/*
Output:-

Herbivores eat plants.
Carnivores eat meat.
Omnivores eat both plants and meat.

*/