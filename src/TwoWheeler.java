public class TwoWheeler {
    String vehicleId;
    String type;
    int wheels;
    float price;

    public TwoWheeler(String vId, String vType, int tyres, float rate) {
        vehicleId = vId;
        type = vType;
        wheels = tyres;
        price = rate;
    }

    public void printDetails() {
        System.out.println("Bicycle Id" + vehicleId);
        System.out.println("Bicycle Type " + type);
        System.out.println("Wheels: " + wheels);
        System.out.println("Price :" + price);
    }

    public class Bicycle {
        boolean gear;

        public Bicycle(String vId, String vName, int tyres, float price, boolean gear) {
            super(vId,
                    vName,
                    tyres,
                    price);
            gear = gear;
        }

        public void printDetails() {
            if (gear == true)
                System.out.println("Geared: Yes");
            else
                System.out.println("Geared: No");
        }

        public void main(String[] args) {
            TwoWheeler obj = new Bicycle(args[0], args[1],
                    Integer.parseInt(args[2]), (args[3]),( args[4]);
            obj.printDetails();
        }
    }
}


