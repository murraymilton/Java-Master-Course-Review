package learnThePart;

public class Functions {
    public static void main(String[]args){
        caclTip(110.35);
        System.out.println(calcSum(2,3));
    }
    public static void printLines(){
        System.out.println("I will copy and paste code.");
        System.out.println("I will use Camel Case when writing class names");
        System.out.println("I will use lower Camel Case when writing function names");
        System.out.println("I will use lower Camel Case when writing variables names\n");
    }

    public static void areaOfRectangle(double length, double width){
        double rectangleArea = length * width;
        System.out.println(String.format("The area of the rectangle is %g", rectangleArea));
    }

    public static void caclTip(double bill){
        double tipSet;
        double totalBill;
        if(bill > 150){
            tipSet =.15;
             totalBill = (tipSet * bill) + bill;
            System.out.println(String.format("Bill total: %f", totalBill));
        }else {
            tipSet =.2;
            totalBill = (tipSet * bill) + bill;
            System.out.println(String.format("Bill total: $%f", totalBill));
        }

    }
    public static double calcSum(double num1, double num2){
        return num1 + num2;
    }

}
