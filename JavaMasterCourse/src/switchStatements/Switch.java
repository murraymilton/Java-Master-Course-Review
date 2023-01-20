package switchStatements;

public class Switch {
    public static void main(String[]args){
        String dayOfWeek = "thursday";
        switch (dayOfWeek){
            case "monday":
                System.out.println("Have a productive week!");
                break;
            case "tuesday":
                System.out.println("Prepare for lecture.");
                break;
            case "wednesday":
                System.out.println("Prep for exam.");
                break;
            case "thursday":
                System.out.println("Prep for exam overview.");
                break;
            case "friday":
                System.out.println("Enjoy the weekend!!!");
                break;
            case "saturday":
            case"sunday":
                System.out.println("Take time to rest and recuperate");
                break;
            default:
                System.out.println("Not a valid day of the week!");
        }
    }
}
