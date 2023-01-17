package workingWithObjects;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public Employee(int baseSalary, int hourlyRate){
        if(baseSalary <= 0 || hourlyRate <= 0)
            throw new IllegalArgumentException("Base Salary or " +
                    "Hourly rate cannot be less than or equal to 0");
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;

    }
    public int getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(int  baseSalary){
            this.baseSalary = baseSalary;

    }
    public int getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(int hourlyRate){

        this.hourlyRate = hourlyRate;
    }
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

}
