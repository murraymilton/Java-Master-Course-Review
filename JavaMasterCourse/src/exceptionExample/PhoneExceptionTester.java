package exceptionExample;

public class PhoneExceptionTester {
    public static void main(String[]args){
       String[] numbers = new String[] {"1234567", "9012225555", null};


       for(int i = 0; i < numbers.length; i++){
           try {
               System.out.println(new Phone("iphone", numbers[i]));
           }catch (IllegalArgumentException ex){
               System.out.println(ex.getLocalizedMessage());
           }

       }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(new Phone("iPhone", numbers[i]));
        }
    }

}
