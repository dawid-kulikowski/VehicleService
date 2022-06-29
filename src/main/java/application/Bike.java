package application;

public class Bike extends Vehicle{
    private BikeType bikeType;

    public Bike(String brand, String model, int productionYear, String vehicleCondition, int speed) {
        super(brand, model, productionYear, vehicleCondition, speed);
    }
}
