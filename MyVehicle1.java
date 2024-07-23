//Q.Create a parent class called "Vehicle" with attributes such as brand,model, year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". Create an object of the Car class and call both the "drive" and "honk" methods. 
// Parent class: Vehicle
class MyVehicle {
    // Attributes
    protected String brand;
    protected String model;
    protected int year;

    // Constructor
    public MyVehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method
    public void drive() {
        System.out.println("Driving the " + brand + " " + model + " (" + year + ")");
    }
}

// Child class: Car
class MyCar1 extends MyVehicle {
    // Additional attribute
    private String color;

    // Constructor
    public MyCar1(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    // Method
    public void honk() {
        System.out.println("The " + color + " " + brand + " " + model + " (" + year + ") honks: Beep beep!");
    }
}

// Main class to demonstrate the use of Vehicle and Car classes
public class MyVehicle1 {
    public static void main(String[] args) {
        // Create an object of the Car class
    	MyCar1 myCar = new MyCar1("Toyota", "Corolla", 2020, "Red");

        // Call the drive method
        myCar.drive();

        // Call the honk method
        myCar.honk();
    }
}

/*Output:-
Driving the Toyota Corolla (2020)
The Red Toyota Corolla (2020) honks: Beep beep!
*/