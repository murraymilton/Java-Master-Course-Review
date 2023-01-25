package inheritance;

public class Vehicle {
   private int vehicleSpeed;
   private String vehicleStarted;
   private String vehicleDirection;
   private String vehicleStopped;

   public Vehicle (int vehicleSpeed, String vehicleStarted, String vehicleDirection, String vehicleStopped){
       this.vehicleSpeed = vehicleSpeed;
       this.vehicleStarted = vehicleStarted;
       this.vehicleDirection = vehicleDirection;
       this.vehicleStopped = vehicleStopped;
   }

   public int getVehicleSpeed(){
       return vehicleSpeed;
   }
   public  void setVehicleSpeed(int vehicleSpeed){
       this.vehicleSpeed = vehicleSpeed;
   }
}
