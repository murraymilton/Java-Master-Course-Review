package classes;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);

        var textBox1 = new TextBox();
        textBox1.setText("TextBox 1");
        System.out.println(textBox1.text.toUpperCase());
        /**
         * @var textBox2 creating a new instance of the same object
         */
        var textBox2 = new TextBox();
        textBox2.setText("TextBox 2");
        System.out.println(textBox2.text);
    }
}
