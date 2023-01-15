package newarrays;

import java.util.Arrays;

public class Arrray {
    public static void main(String[]args){

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[3] = 5;

        System.out.println(Arrays.toString(numbers));
        System.out.println("Object in memory: " + numbers);

        int [] ages = {21, 18, 22, 36, 40, 41};
        int [] fizzBuzzNumbers;

        int numberDecrement = 100;

        System.out.println(ages.length);

        // Multidimensional Arrays

        int [][] numbs = new int[2][3]; // 2 rows and 3 columns
        numbs[0][0] = 1;
        System.out.println(Arrays.deepToString(numbs));

        int [][] ageNew = {{18,19,20}, {21, 22, 23}};
        System.out.println(Arrays.deepToString(ageNew));
    }
}
