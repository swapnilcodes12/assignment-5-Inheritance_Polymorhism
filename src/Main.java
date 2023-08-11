public class Main {
    public static void main(String[] args) {
        Car car = new Car("MH28AB4343","TATA","RED",2,6);
        car.display();

        Bus bus =new Bus("MH13XY3434","ASHOK LEYLAND",32);
        bus.display();

        CheckPost.checkVehicle(bus);
    }
}