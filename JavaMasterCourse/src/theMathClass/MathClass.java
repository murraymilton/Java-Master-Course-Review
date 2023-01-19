package theMathClass;

public class MathClass {
    public static void main(String[]args){
        int result1 = Math.round(11.35F);
        System.out.println("Using math.round:" + result1);

        int result2 = (int)Math.ceil(1.3);
        System.out.println("Using math.ceil:"+result2);

        int result3 = (int)Math.floor(2.35);
        System.out.println("Using math.floor:"+result3);

        int result4 = Math.max(5,9);
        System.out.println("Math.max:"+result4);

         int result = (int)Math.round(Math.random() * 10);
        System.out.println("Random Number:" + result);
    }
}
