package javaObjectsAndAPIs;

public class Square extends Rectanlge {
    /**
     * @calculatePerimeter method overriding a method to calculate square
     * @return
     */
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
