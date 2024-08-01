/*Q.Assignment-1. ● Write a Java program named Car ● The Car class should have the following attributes: make (String), model (String) , year (short) , and price(int) .
 * ● The car class should have a constructor that takes all the attributes. ● Add a main method to instantiate car objects. 
 * ● The program should allow the user to create and display objects of each Car Class. */
import java.util.Scanner;

// Car class
class MyCarModel {
    // Attributes
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public MyCarModel(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: ₹" + price);
    }
}

// Main class
public class CarModel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get car details from the user
        System.out.println("Enter car make:");
        String make = scanner.nextLine();

        System.out.println("Enter car model:");
        String model = scanner.nextLine();

        System.out.println("Enter car year:");
        short year = scanner.nextShort();

        System.out.println("Enter car price:");
        int price = scanner.nextInt();

        // Create a Car object
        MyCarModel car = new MyCarModel(make, model, year, price);

        // Display the car details
        car.displayCarDetails();
        
        // Close the scanner
        scanner.close();
    }
}



/*
Output:-
Enter car make:
Toyota
Enter car model:
corolla
Enter car year:
2022
Enter car price:
150
Car Details:
Make: Toyota
Model: corolla
Year: 2022
Price: ₹150
*/