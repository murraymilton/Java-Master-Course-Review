package methods;

public class Methods {
    public static void main(String[]args){
        System.out.println(Methods.findTheArea(2,3));
        System.out.println(Methods.addNumbers(23,39));
        System.out.println(Methods.multiplyNumbers(25,25));
    }

    public static double findTheArea(double length, double width){
        double area = length * width;
        return area;
    }

    public static  int addNumbers(int num1, int num2){
        int sumNumbs = num1 + num2;
        return sumNumbs;
    }

    public static int multiplyNumbers(int num1, int num2){
        int multiplyNumbs = num1 * num2;
        return multiplyNumbs;
    }
}
