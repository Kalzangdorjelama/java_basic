package ReadingInput;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your age : ");
        // byte age = scanner.nextByte();
        // double age = scanner.nextDouble();
        // int age = scanner.nextInt();
        // System.out.println("Your Age is : " + age);


        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter your name : ");
        // String name = scanner2.next();
        String name = scanner2.nextLine().trim(); // this nextline helps to print the whole sentance from user above if we write a next then only first words as its a token will be printed after space it doesnot see

        System.out.println("Your Age is : " + name);
    }
}
