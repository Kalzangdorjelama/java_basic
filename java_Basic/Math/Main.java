package Math;

public class Main {
    public static void main(String[] args){
        int result = Math.round(1.1F);
        // System.out.println(result);

        int result2 = (int)Math.ceil(1.1F);
        // System.out.println(result2);

        int result3 = (int)Math.round(Math.random() * 100);
        // System.out.println(result3);

        // int result4 = (int)Math.random() * 100; // eg here random number generate from 0 to 1 and the random number eg; 0.213 as it converted into int so to 0 and multiply with 100 which will be 0 so we have to wrapped the expression in parenteses below
        int result4 = (int)(Math.random() * 100);
        System.out.println(result4);

    }
}
