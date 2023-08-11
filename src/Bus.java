public class Bus extends Vehicle {
    private int capacity;

    public Bus(String passingNo, String manufacturer, int capacity) {
        super(passingNo, manufacturer);
        if (capacity > 0 && capacity < 80) {
            this.capacity = capacity;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0 && capacity < 80) {
            this.capacity = capacity;
        }
    }

    @Override
    public void start() {
        System.out.println(" The Bus is Start.......");
    }

    @Override
    public void stop() {
        System.out.println(" The Bus is Stop ........");
    }

    @Override
    public void move() {
        System.out.println(" The Bus is move .......");
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" capacity of Bus : " + capacity);
    }
}
