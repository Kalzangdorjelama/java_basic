package Hello;

import java.util.Date;
import java.awt.*;

public class Hello {
    public static void main(String[] arg) {
        // System.out.println("Hello kalzang wordl!");
        // int myAge = 30, temp = 70;
        // int herAge = myAge; // camalcase notation hai
        // System.out.println(herAge);

        // primitive type
        byte myAge = 80;
        int herage = 30;
        long viewsCount = 3_123_123_321L;
        float price = 123.11F;
        double aPrice = 12.22;
        char letter = 'A';
        boolean isEligible = true;

        // Non-primitive type
        Date now = new Date();
        now.getTime();
        // System.out.println(now);

        // so in case of memory allocation the primitive and non-primitive are different
        // so here we are

        // for primitive ---> copy by value
        byte x = 1;
        byte y = 2;
        x = y;
        System.out.println(x);

        // for non-primitive ---> reference by reference i.e memory address
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point2.y = 77;
        System.out.println(point1);
        System.out.println(point2);

        // non-primitive type
        String message = new String("Hello world!");
        System.out.println(message);

        // so here we can write it with out new keyword as it is shorthand syntex
        String message2 = "Hello world second!";
        System.out.println(message2.startsWith("H"));
        System.out.println(message2.endsWith("d"));

        System.out.println(message2.length());
        System.out.println(message2.toLowerCase());
        System.out.println(message2.toUpperCase());
        System.out.println(message2.indexOf("d"));

        System.out.println(message2.replace("d", "kalzang"));
        System.out.println(message2);

        String message3 = " kalzang ";
        System.out.println(message3);
        System.out.println(message3.trim());

        // Escape Sequence
        String productName = "Air force \"jordan\" 12";
        System.out.println(productName);
        // eg; C:\Users\DELL\OneDrive\Desktop\
        String directoryPathFile = "C:\\Users\\DELL\\OneDrive\\Desktop";
        System.out.println(directoryPathFile);

        String directoryPathFile2 = "C:\\Users\\DELL\\OneDrive\\Desk\ntop";
        System.out.println(directoryPathFile2);

        String directoryPathFile3 = "C:\\Users\\DELL\\OneDrive\\Desk\ttop";
        System.out.println(directoryPathFile3);
        
    }
}