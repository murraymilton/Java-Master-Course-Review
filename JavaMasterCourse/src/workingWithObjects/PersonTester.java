package workingWithObjects;

public class PersonTester {

    public static void main(String[]args){



        var employee = new Employee(35000, -34);

        int wages = employee.calculateWage(3);
        System.out.println(wages);
//     var employee = new Employee();
//     employee.baseSalary = 100000;
//     employee.hourlyRate = 35;
//     int wage = employee.calculateWage(10);
//        System.out.println(wage);
//        Person teddy = new Person("Teddy", "Hues");
//        Person Michael = new Person("Michael", "Schonowski");
//
//     System.out.println( teddy + "\n" + Michael);
//
//       Car bmw = new Car(78, true, 2.33);
//       System.out.println(bmw);
//
//       var textBox = new TextBox();
//       textBox.setText("This is great!");
//        System.out.println("Setting the value:" + textBox.text.toUpperCase());
//
//        textBox.clear();
//        System.out.println("Clear method:" +  textBox.text);
    }
}
