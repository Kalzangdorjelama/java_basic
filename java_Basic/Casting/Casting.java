package Casting;

public class Casting {
    public static void main(String[] args) {
        // implicitly type conversion
        short x = 2;
        int y = x + 3;
        // System.out.println(y);

        // explicitly type conversion
        double a = 2;
        int b = (int) a + 3;
        // System.out.println(b);

        // but for string we have to parse hai
        String age = "23";
        // int myAge = age + 2; // it show error as the string cannot be expression here so we have to parse it to int here
        // System.out.println(myAge);

        String age1 = "23";
        int myAge1 = Integer.parseInt(age) + 2; // it show error as the string cannot be expression here so we have to parse it to int here

        System.out.println(myAge1);

    }
}
