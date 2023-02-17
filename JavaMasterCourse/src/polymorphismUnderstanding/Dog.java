package polymorphismUnderstanding;

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("woof woof woof");
    }

    public void fetch(){
        System.out.println("fetch is fun!!! Tail wiggles");
    }
}
