package strings;


public class Strings {
    public static void main(String[]args){
        String message = "     Welcome to learning Java";
        String newItem = "Spring";

        System.out.println(message.endsWith("Java"));
        System.out.println(newItem.length());
        System.out.println(message.indexOf("learning"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());

    }
}
