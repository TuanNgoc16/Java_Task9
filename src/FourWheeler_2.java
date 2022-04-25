public class FourWheeler_2 {
    private final String vehicleNo;
    private final String vehicleName;
    private final String wheels;
    private boolean powerSteer;
    public FourWheeler_2 ( String vID,String vName, int numWheels, boolean pSteer){
        vehicleNo = vID;
        vehicleName = vName;
        wheels = String.valueOf(numWheels);
        powerSteer = pSteer;
    }
    public void showDetails () {
        System.out.println("Vehicleno" + vehicleNo);
        System.out.println("VehiclenName" + vehicleName);
        System.out.println("Number of Wheels" + wheels);
        if ( powerSteer == true){
            System.out.println("Power Steering : yes");
        }
        System.out.println("Power Steering: No");
    }
    public void accelerate ( int speed){
        System.out.println("Maximum acceleration"+ speed + "kmph" ) ;
    }

        public static void main ( String[] args){
            FourWheeler objFour = new FourWheeler("LA-09-CS","Volkswwagen",4,true);
            objFour.showDetails();
            objFour.accelerate(200);
        }
    }
