package constructor;

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // by default object created the non parameterized constructor is created as we
    // are creating here so it will invoked
    Student() {
        System.out.println("I am non parameterized constructor");
    }

    // parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student s3) {
        this.name = s3.name;
        this.age = s3.age;
    }
}

public class Constructor {
    public static void main(String args[]) {
        // non-paraterized constructor
        Student s1 = new Student(); // constructor if created then automatically invoked hunxa

        // parameterized constructor
        Student s2 = new Student("kalzang", 21);
        s2.printInfo();

        // copy constructor
        Student s3 = new Student();
        s3.name = "dorje";
        s3.age = 17;
        Student s4 = new Student(s3);
        s4.printInfo();

        // NOTE: we donot have to write a destructor to deallocated the object that it has a grabage collector that helps to deallocate the object if is not used. In c++ we have to write destructor to deallocated the constructor object

    }
}
