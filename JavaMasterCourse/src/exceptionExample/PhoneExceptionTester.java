package exceptionExample;

public class PhoneExceptionTester {
    public static void main(String[]args){
       String[] numbers = new String[3];
       numbers[0] = "1234567";
       numbers[1] = "7654321";
       numbers[2] = null;

       for(int i = 0; i < numbers.length; i++){
           try {
               System.out.println(new Phone("iphone", numbers[i]));
           }catch (IllegalArgumentException ex){
               System.out.println(ex.getLocalizedMessage());
           }finally {
           }
       }
    }

}
