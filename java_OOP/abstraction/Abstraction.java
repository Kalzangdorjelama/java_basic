package abstraction;

// Abstract class: Cannot create an object of this class directly.
// Used to provide a common base for child classes and enforce method implementation rules.
abstract class Animal {

    // Abstract method: No body here.
    // Every non-abstract subclass of Animal MUST implement this method.
    abstract void walk();

    // Non-abstract method: Can be directly inherited and used by child classes.
    public void eat() {
        System.out.println("Animal eats");
    }

    // Constructor of abstract class.
    // Runs whenever a subclass object is created.
    Animal() {
        System.out.println("You are creating a new Animal");
    }
}

// Child class (Concrete class) that extends Animal.
// Must provide implementation for the abstract walk() method.
class Horse extends Animal {

    // Implementation of the abstract method from Animal.
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

    // Constructor of Horse.
    // Automatically calls Animal() first (constructor chaining).
    Horse() {
        System.out.println("Created a Horse");
    }
}

// Another child class of Animal.
class Chicken extends Animal {

    // Implementation of the abstract method from Animal.
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        // ❌ Cannot do this: Animal animal = new Animal();
        // Because Animal is abstract.

        // ✅ Create Horse object
        Horse horse = new Horse(); // First calls Animal() constructor, then Horse() constructor

        // Calling methods
        horse.walk(); // Runs Horse's version of walk()
        horse.eat(); // Runs Animal's eat() method

        // ✅ Create Chicken object
        Chicken chicken = new Chicken();
        chicken.walk(); // Runs Chicken's version of walk()
        chicken.eat(); // Runs Animal's eat() method

        // ✅ Runtime polymorphism:
        // Animal reference can point to different child objects.
        Animal obj = new Horse();
        obj.walk(); // Calls Horse's walk()
        obj.eat(); // Calls Animal's eat()
    }
}
