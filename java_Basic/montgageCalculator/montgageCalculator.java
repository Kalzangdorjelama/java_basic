package montgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class montgageCalculator {
    public static void main(String[] args) {
        final int PERCENTAGE = 100;
        final int MONTH_IN_YEAR = 12;

        int principleAmount = 0;
        float monthlyInterestRate = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principle Amount : ");
            principleAmount = scanner.nextInt();
            if (principleAmount >= 1_000 && principleAmount <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual InterestRate : ");
            float annuaInterestRate = scanner.nextFloat();
            if (annuaInterestRate >= 1 && annuaInterestRate <= 30) {
                monthlyInterestRate = annuaInterestRate / MONTH_IN_YEAR / PERCENTAGE;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("period(years) : ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");

        }

        double montage = principleAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        String montgageFormate = NumberFormat.getCurrencyInstance().format(montage);
        System.out.print("Montage : " + montgageFormate);
        scanner.close();
    }
}
