package application;

import java.io.IOException;
import java.util.Scanner;

public class VehicleService {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = new Car();

        System.out.println("Brand: ");
        vehicle.setBrand(scanner.next());
        System.out.println("Model: ");
        vehicle.setModel(scanner.next());
        System.out.println("Year of production:");
        vehicle.setProductionYear(scanner.nextInt());
        System.out.println("Condition of Vehicle (NEW,USED,DAMAGED: ");
        vehicle.setVehicleCondition(scanner.next());


    }
}
