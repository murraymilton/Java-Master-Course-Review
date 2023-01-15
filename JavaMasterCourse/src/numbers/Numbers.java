package numbers;

import java.text.NumberFormat;

public class Numbers {

    public static void main(String[]args){


        // Formatting Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result2 = currency.format(1234567.891);
        System.out.println(result2);

        // Get Percent Instance
//        NumberFormat percentage = NumberFormat.getPercentInstance();
        //Method Chaining
        String percent = NumberFormat.getPercentInstance().format(15);
        System.out.println(percent);



        System.out.println(Math.round(21.9));
        int result = (int)Math.floor(2.3);
        System.out.println(result);

        System.out.println("Max Value:" +  Math.max(29,30));
        int random = (int)Math.round(Math.random() * 100);
        System.out.println(random);
    }
}
