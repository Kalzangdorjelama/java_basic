package Formatting;

import java.text.NumberFormat;

public class Formatting {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1213.121);
        System.out.println(result);

        // Shorthand
        NumberFormat.getCurrencyInstance();
        String result2 = NumberFormat.getCurrencyInstance().format(1213.121);
        System.out.println(result2);

        // for percentage
        String result3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);
    }
}
