package definingClasses;

import java.util.Scanner;

public class ClassTester {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student GPA: ");
        double newGPA = sc.nextDouble();
        System.out.println("Enter student first name: ");
        String studentFirstName = sc.next();
        System.out.println("Enter student last name:");
        String studentLastName = sc.next();
        boolean lightOn = true;
        int numberOfSiblings = 5;
        double gradeAverage = 98.73;
        int age = 36;
        double gpa = newGPA;
        char firstInitial = 'M';
        char lastInitial = 'M';
        boolean honorSociety = true;
        String firstName = studentFirstName;
        String lastName = studentLastName;

        if(gpa >= 3.65){
            System.out.println("You qualify for the Honor Society! Great Job!");
        }else{
            honorSociety = false;
            System.out.println("Currently not eligible for " +
                    "honor society");
        }
        System.out.println(firstName + " " +  lastName + " has a GPA of " + gpa);
    }
}
