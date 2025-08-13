package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int result = scanner.nextInt();
        if (result % 5 == 0 && result % 3 == 0) 
            System.out.println("FizzBuzz");
        else if (result % 5 == 0) 
            System.out.println("Fizz");
        else if (result % 3 == 0) 
            System.out.println("Buzz");
        else
            System.out.println(result);
        scanner.close();
    }
}
