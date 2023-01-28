package polymorphismExample;

public class Boat extends Vehicle{
    public Boat(){
        super("Boat start", "Boat stop", "Boat speed",
                "Boat direction");
    }

    public void depthFinder(){
        System.out.println("How deep is this water?");
    }
}
