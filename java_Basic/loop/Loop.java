package loop;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // ========== for loop
        // for (int i = 1; i <= 5; i++)
        // System.out.println("Hello world " + i);

        // for (int i = 5; i >= 1; i--)
        // System.out.println("Hello world " + i);

        Scanner scanner = new Scanner(System.in);
        String input = "";

        // ========== while loop
        while (!input.equals("quite")) {
            System.out.print("Input : ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        }

        // ========= do while loop
        // do{
        // System.out.println("Input : ");
        // input = scanner.nextLine().toLowerCase();
        // }while(!input.equals("quite"));

        // ========= break and continue
        while (true) {
            System.out.print("Input : ");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quite"))
                break;
            System.out.println(input);
        }
        scanner.close();
    }
}
