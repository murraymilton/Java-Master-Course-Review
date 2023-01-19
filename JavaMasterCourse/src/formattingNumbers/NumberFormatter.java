package formattingNumbers;

import java.text.NumberFormat;

public class NumberFormatter {
    public static void main(String[]args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        String result = currency.format(1234567.891);
        System.out.println(result);
        System.out.println(result2);
    }
}
