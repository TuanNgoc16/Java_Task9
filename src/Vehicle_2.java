public class Vehicle_2 {
    protected String vehicleNo;
    protected String getVehicleName;
    protected int wheels;
    public Vehicle_2 ( String vId, String vName, int numWheels){
        vehicleNo = vId;
        String vehicleName = vName;
        wheels= numWheels;
    }
    public void accelerate ( int speed) {
        System.out.println("Accelerating at:" + speed + "kmph");
    }
}
