package classAndObject;

// Class to represent a Pen
class Pen {
    String color; // property of Pen (instance variable)
    String type;  // property of Pen (instance variable)

    // Method to perform an action
    public void write() {
        System.out.println("Write something");
    }

    // Method to print the pen's color
    // 'this' keyword refers to the current object calling the method
    public void printColor() {
        System.out.println(this.color);
    }
}

// Class to represent a Student
class Student {
    String name; // property of Student (instance variable)
    int age;     // property of Student (instance variable)

    // Method to print student's details
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Constructor: special method called when an object is created
    // This is a "non-parameterized constructor" because it has no arguments
    Student() {
        System.out.println("I am non parameterized constructor");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {

        // ----------- PEN OBJECTS -----------
        Pen pen1 = new Pen(); // Creating first Pen object
        pen1.color = "green";
        pen1.type = "gel";

        Pen pen2 = new Pen(); // Creating second Pen object
        pen2.color = "yellow";
        pen2.type = "bulletpoint";

        // Calling method to print colors
        pen1.printColor(); // prints "green"
        pen2.printColor(); // prints "yellow"

        // ----------- STUDENT OBJECT -----------
        // Creating Student object will automatically call the constructor
        Student s1 = new Student(); // Prints "I am non parameterized constructor"

        // Setting properties
        s1.name = "kalzang";
        s1.age = 22;

        // Calling method to print student info
        s1.printInfo(); // prints "kalzang" and "22"
    }
}
