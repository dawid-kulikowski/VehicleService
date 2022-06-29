package application;

import java.io.IOException;

public class Vehicle {
    private String brand;
    private String model;
    private int productionYear;
    private String vehicleCondition;
    private int speed;

    public Vehicle() {

    }

    public Vehicle(String brand, String model, int productionYear, String vehicleCondition, int speed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.vehicleCondition = vehicleCondition;
        this.speed = speed; }


        public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) throws IOException {
        if (productionYear>2022){
            throw new IOException("Wrong year input...");
        }
        this.productionYear = productionYear;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}











