package application;

public class Bike extends Vehicle{
    private BikeType bikeType;

    public Bike() {
    }

    public Bike(String brand, String model, int productionYear, String vehicleCondition, int speed, int vehicleWorth) {
        super(brand, model, productionYear, vehicleCondition, speed,vehicleWorth);
    }


    @Override
    public double insuranceCost() {
        double insurancePrice = getVehicleWorth() * 0.25;
        System.out.println("Insurance Price is:" + insurancePrice);
        return insurancePrice;
    }
}
