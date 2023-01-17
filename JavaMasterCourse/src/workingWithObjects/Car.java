package workingWithObjects;

public class Car {
    private int milesPerHour;
    private boolean engineOn;
    private double gasLevel;

    public Car(int milesPerHour, boolean engineOn, double gasLevel){
        this.milesPerHour = milesPerHour;
        this.engineOn = engineOn;
        this.gasLevel = gasLevel;
    }

    public int getMilesPerHour(){
        return  milesPerHour;
    }
    public void setMilesPerHour(int milesPerHour){
        this.milesPerHour = milesPerHour;
    }
    public boolean isEngineOn(){
        return engineOn;
    }
    public void setEngineOn(boolean engineOn){
        this.engineOn = engineOn;
    }
    public double getGasLevel(){
        return gasLevel;
    }
    public void setGasLevel(double gasLevel){
        this.gasLevel = gasLevel;
    }

    @Override
    public String toString(){
        return "Current Speed:" + milesPerHour + " Engine On:" + engineOn +
                " Current Gas Level:" + gasLevel;
    }
}
