// session 7
// Snippet 2
public class FourWheeler extends Vehicle {
    private boolean powerSteer;

    public FourWheeler(String vID, String vName, int numWheelers, boolean pSteer) {
        String vehicleNo = vID;
        String vehicleName = vName;
        int wheels = numWheelers;
        powerSteer = pSteer;

    }

    public void showDetails() {
        System.out.println("vehicleNo" + vehicleNo);
        System.out.println("Vehicle Name " + vehicleName);
        System.out.println("Number of Wheels " + wheels);
        if (powerSteer == true) {
            System.out.println("Power Steering: Yes");
        } else
            System.out.println("Power Steering: No");

    }


            public static void main ( String[] args) {
                FourWheeler objFour = new FourWheeler("LA-9-CS-1406","Volkswagen",4,true);
                 objFour.showDetails();
                objFour.accelerate(200);
            }

}