package application;

import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleService {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = new Car();
        Vehicle bike = new Bike();


        try {
            System.out.println("Year of production:");
            vehicle.setProductionYear(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("error");
        } finally {
            System.out.println("Code");
        }




//        System.out.println("Brand: ");
//        vehicle.setBrand(scanner.next());
//        System.out.println("Model: ");
//        vehicle.setModel(scanner.next());
        System.out.println("Year of production:");
        vehicle.setProductionYear(scanner.nextInt());
//        System.out.println("Condition of Vehicle (NEW,USED) : ");
//        vehicle.setVehicleCondition(scanner.next());
//        System.out.println("Condition of Vehicle (NEW,USED) : ");
//        vehicle.setVehicleWorth(scanner.nextInt());
//
//        System.out.println("Brand: ");
//        bike.setBrand(scanner.next());
//        System.out.println("Model: ");
//        bike.setModel(scanner.next());
//        System.out.println("Year of production:");
//        bike.setProductionYear(scanner.nextInt());
//        System.out.println("Condition of Bike (NEW,USED) : ");
//        bike.setVehicleCondition(scanner.next());
//        System.out.println("Bike Estimated Worth: ");
//        bike.setVehicleWorth(scanner.nextInt());
//
//        System.out.println(vehicle.getBrand() + vehicle.getModel() + vehicle.getVehicleCondition());
//        vehicle.insuranceCost();
//        bike.insuranceCost();

    }


}
