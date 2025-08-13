package staticA;

class Student {
    String name;       // Instance variable → each object gets its own copy
    static String school; // Static variable → shared by ALL objects of this class

    // Static method → belongs to the class, not to any specific object
    public static void changeSchool() {
        school = "newSchool"; // Can only directly access static members
    }
}

public class Static {
    public static void main(String[] args) {
        
        // Accessing static variable using class name (recommended way)
        Student.school = "TIA";

        // Creating first student object
        Student student1 = new Student();
        student1.name = "kalzang";

        // Accessing static variable
        System.out.println(Student.school); // prints "TIA"

        // Changing school using static method
        Student.changeSchool();
        System.out.println(Student.school); // prints "newSchool"

        // Creating second student object
        Student student2 = new Student();
        student2.name = "Lama";

        // Both students share the same 'school' value
        System.out.println(student1.school); // prints "newSchool"
        System.out.println(student2.school); // prints "newSchool"
    }
}
