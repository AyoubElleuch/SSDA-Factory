// Sample Main code that uses the CarFactory interface to create car objects
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        // Create a Sedan car
        Car sedan = carFactory.createCar("SEDAN");
        sedan.assemble();

        // Create an SUV car
        Car suv = carFactory.createCar("SUV");
        suv.assemble();
    }
}
