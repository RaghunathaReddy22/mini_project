package mini_project;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingSystem {

	static int totalSlots, availableSlots;
	static ArrayList<String> parkedCars = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no.of slotes");
		totalSlots =s.nextInt();
		availableSlots=totalSlots;
		while(true) {
			System.out.println("\nWhat would you like to do?");
			System.out.println("1.Park a car");
			System.out.println("2.Remove the car");
			System.out.println("3.View the car");
			System.out.println("4.Exit");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				parkCar();
				break;
			case 2:
				removeCar();
				break;
			case 3:
				viewCars();
				break;
			case 4:
				System.exit(0); 
			default:
				System.out.println("Invalid choice .Please try again.");
			}


		}
		
	}

	public static void viewCars() {
		if (totalSlots == availableSlots) {
			System.out.println("There are no  car available.");
			return;
		}
		System.out.println("Parked Cars:");
		for(String licensePlate :parkedCars) {
			System.out.println(licensePlate);
		}
			
	}

	public static void removeCar() {
		if (totalSlots == availableSlots) {
			System.out.println("There are no  car available.");
			return;
		}
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the license plate number of the car.");
		String licensePlate = s.nextLine();
		if (parkedCars.contains(licensePlate)) {
			parkedCars.remove(licensePlate);
			availableSlots++;
			System.out.println("Car removed successfully.");
		} else
			System.out.println("No car with this number.");
	}

	public static void parkCar() {
		if (availableSlots == 0) {
			System.out.println(" sorry ,there are no available slots");
			return;
		}
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the license plate number of the car");
		String licensePlate = s.nextLine();
		parkedCars.add(licensePlate);
		availableSlots--;
		System.out.println("Car parked successfully");
	}

}
