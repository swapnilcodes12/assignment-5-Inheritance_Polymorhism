public class Car extends Vehicle {
    private String color;
    private byte fuelType;
    private int noOfGears;
    private String fuelType1;

    public Car(String passingNo, String manufacturer, String color, int fuelType, int noOfGears) {
        super(passingNo, manufacturer);

        this.color = color;

        if(fuelType == 1){
            this.fuelType = (byte) fuelType;
            this.fuelType1 = "Petrol";
        }else if(fuelType == 2){
            this.fuelType = (byte) fuelType;
            this.fuelType1 = "Disel";
        }

        if (noOfGears > 0 && noOfGears <= 6) {
            this.noOfGears = noOfGears;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType1;
    }

    public void setFuelType(byte fuelType) {
        if(fuelType == 1){
            this.fuelType = fuelType;
            this.fuelType1 = "Petrol";
        }else if(fuelType == 2){
            this.fuelType = fuelType;
            this.fuelType1 = "Disel";
        }
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        if (noOfGears > 0 && noOfGears <= 6) {
            this.noOfGears = noOfGears;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" color : " + color + " FuelType : " + fuelType1 + " noOfGears : " + noOfGears);
    }

    @Override
    public void start() {
        System.out.println(" The car is Start.......");
    }

    @Override
    public void stop() {
        System.out.println(" The car is Stop ........");
    }

    @Override
    public void move() {
        System.out.println(" The car is moving .......");
    }
}
