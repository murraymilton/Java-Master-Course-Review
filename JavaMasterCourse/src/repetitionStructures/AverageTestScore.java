package repetitionStructures;

import java.util.Scanner;

public class AverageTestScore {

    public static  void main(String[]args) {
        //Initialize what we know;
        int numberOfStudents = 24;
        int numberOfTests = 4;


        Scanner sc = new Scanner(System.in);

        //Process all students
        for(int i = 0; i < numberOfStudents; i++){

            double total = 0;

            //Process a student's test scores
            for(int j = 0; j < numberOfTests; j++){
                System.out.print("Enter the score for Test #" + (j+1));
                double score = sc.nextDouble();
                total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }
    }

}
