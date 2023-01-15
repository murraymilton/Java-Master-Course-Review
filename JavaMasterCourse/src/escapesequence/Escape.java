package escapesequence;

public class Escape {

    public static void main(String[]args){
        String message = "Welcome to Muse \"Murray\"";
        String directoryLocation = "c:\\Windows\\...";
        System.out.println(message);
        System.out.println(directoryLocation);

        String newLine = "This morning coffee \nwas amazing!";
        String tabSpace = "d:\tWindows\\....";

        System.out.println("New Line:" + newLine);
        System.out.println("Insert Tab:" + tabSpace);
    }
}
