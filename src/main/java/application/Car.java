package application;

public class Car extends Vehicle {
    private String engineType;
    private String transmission;

    public Car() {

    }

    public Car(String brand, String model, int productionYear, String vehicleCondition, int speed, int vehicleWorth) {
        super(brand, model, productionYear, vehicleCondition, speed, vehicleWorth);
    }

}

