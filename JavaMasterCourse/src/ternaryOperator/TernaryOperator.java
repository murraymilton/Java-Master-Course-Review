package ternaryOperator;

public class TernaryOperator {
    public static void main(String[]args){
        int income = 120_000;
        String className;
        className = income > 100_000 ? "First Class": "Economy Class";
        System.out.println(className);
    }
}
