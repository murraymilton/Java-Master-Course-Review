package methods;

/**
 * The class
 */
public class Methods {
    /**
     * @findTheArea
     * @param args
     */
    public static void main(String[]args){
        System.out.println(Methods.findTheArea(2,3));
        System.out.println(Methods.addNumbers(23,39));
        System.out.println(Methods.multiplyNumbers(25,25));
        System.out.println(Methods.plusMethod(25.23,39.21));
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

    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }
}
