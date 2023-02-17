package polymorphismUnderstanding;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow meow meow");
    }

    public void scratch(){
        System.out.println("I am a cat. I scratch things. purr purr prrr.");
    }

}
