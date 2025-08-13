package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 7;
        numbers[1] = 5;
        numbers[2] = 2;
        // System.out.println(Arrays.toString(numbers));

        // shorthand to initialize array
        int[] numbers2 = { 6, 4, 8, 10, 7 };
        // System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        // System.out.println(Arrays.toString(numbers2));

        // Multi-Dimensional Arrays
        int[][] matrix = new int[2][3];
        matrix[0][0] = 4;
        matrix[0][1] = 7;
        matrix[0][2] = 2;
        matrix[1][0] = 5;
        matrix[1][1] = 4;
        matrix[1][2] = 9;

        // System.out.println(Arrays.deepToString(matrix));

        // shorthand syntax to declare Multi-Dimensional Arrays
        int[][] matrix2 = { { 4, 7, 2 }, { 5, 4, 9 } };
        System.out.println(Arrays.deepToString(matrix2));

    }

}
