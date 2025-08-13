package Operator;

public class Operator {
    public static void main(String[] args) {
        int x = 7;
        int y = 7;
        int z = 2;

        // comparision operator
        System.out.println(x == y); // true
        System.out.println(x != y); // false
        System.out.println(z <= y); // true

        // logical operator
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println("isWarm : " + isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println("isEligible : " + isEligible);

        // if condition
        int temp = 32;
        if (temp > 30) {
            System.out.println("Its a hot day");
            System.out.println("Drink plenty of water");
        } else if (temp > 20)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");

        // simplifying the if statements
        // int income = 15_100;
        // boolean hasHighIncome2;
        // if (income > 12_000)
        // hasHighIncome2 = true;
        // else
        // hasHighIncome2 = false;

        // more better way to write above code
        // int income = 15_100;
        // boolean hasHighIncome2 = false;
        // if (income > 12_000)
        // hasHighIncome2 = true;

        // more better way than to write above code
        int income = 15_100;
        boolean hasHighIncome2 = (income > 12_000);
        System.out.println("hasHighIncome2 : " + hasHighIncome2);

        // ternary operator
        // int income2 = 120_999;
        // String className = "Economy";
        // if (income2 > 100_000)
        // className = "First";
        // else
        // className = "Economy";

        // better way to write this above code
        // int income2 = 120_999;
        // String className = "Economy";
        // if (income2 > 100_000)
        // className = "First";

        int income2 = 120_999;
        String className = (income2 > 100_000) ? "First" : "Economy";
        System.out.println("ClassName : " + className);

    }
}
