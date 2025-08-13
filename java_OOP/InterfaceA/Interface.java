package InterfaceA;

// Interface is like a class, but it is 100% abstract by default.
// It is used to define a "contract" — what methods a class must have.
interface Animal {

    // In an interface:
    // - All methods are implicitly public and abstract (even if you don't write it).
    // - Methods have no body (implementation).
    void walk(); // Automatically: public abstract void walk();

    // Interfaces cannot have non-abstract methods (unless using 'default' or 'static' in Java 8+).
    // ❌ Example (this would cause an error):
    // void eat() {
    //     System.out.println("Eating");
    // }

    // Interfaces cannot have constructors.
    // ❌ Example:
    // Animal() {
    //     System.out.println("Constructor");
    // }

    // Variables in interfaces are:
    // - public
    // - static
    // - final (cannot be changed)
    int eyes = 2; // This is effectively: public static final int eyes = 2;
}

// Another interface (empty here, just for demonstration)
interface Herbivore {

}

// A class can implement multiple interfaces (this is how Java supports multiple inheritance of type).
class Horse implements Animal, Herbivore {

    // Must provide implementation for all abstract methods in the interfaces it implements.
    // Method must be public, because interface methods are public by default.
    public void walk() {
        System.out.println("Horse has 4 legs");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Creating Horse object
        Horse horse = new Horse();

        // Calling method from Animal interface (implemented by Horse)
        horse.walk();

        // Accessing interface variable
        System.out.println("Horse has " + Animal.eyes + " eyes");

        // ❌ Cannot change interface variables:
        // Animal.eyes = 3; // Error: cannot assign a value to final variable 'eyes'
    }
}
