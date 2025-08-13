package Inheritance;

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

// single inheritance
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

// multi-level inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

// hierarchical inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.1415) * r * r);
    }
}

// hybrid inheritance which is mixed of single and hierarchial inheritance

public class Inheritance {
    public static void main(String[] args) {
        // single inheritance
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(2, 4);

        // multi-level inheritance
        Triangle t3 = new EquilateralTriangle();
        t3.area();
        t3.area(2, 4);

        // hierarchial inheritance
        Circle t4 = new Circle();
        t4.area();
        t4.area(2);
    }
}

// ==================== singel inheritance

//                1 -> base class / parent class
//                |
//                2 -> child class / derived class

// =================== multi-leve inheritance

//                1 -> base class / parent class
//                |
//                2 -> child class / derived class
//                |
//                3 -> child class / derived class

// ================== hierarchial inheritance
//                1 -> base class / parent class
//               / \
//               2 2 -> -> child class / derived class