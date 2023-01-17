package workingWithObjects;

public class PersonTester {

    public static void main(String[]args){
        Person teddy = new Person("Teddy", "Hues");
        Person Michael = new Person("Michael", "Schonowski");

     System.out.println( teddy + "\n" + Michael);

       Car bmw = new Car(78, true, 2.33);
       System.out.println(bmw);
    }
}
