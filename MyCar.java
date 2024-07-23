//Q.Write a program using in inheritance. where Car is the Super class, Mahindra is derived class. define methods in two classes and using Mahindra object call car class method. 
// Superclass: Cars
class Cars {
    // Method in Cars class
    public void startEngine() {
        System.out.println("The car engine is starting...");
    }

    // Method in Cars class
    public void stopEngine() {
        System.out.println("The car engine is stopping...");
    }
}

// Derived class: Mahindra
class Mahindra extends Cars {
    // Additional method in Mahindra class
    public void offRoadDriving() {
        System.out.println("Mahindra is ready for off-road driving!");
    }
}

// Main class to demonstrate the use of Car and Mahindra classes
public class MyCar {
    public static void main(String[] args) {
        // Create an object of the Mahindra class
        Mahindra myMahindra = new Mahindra();

        // Call the methods from Car class using Mahindra object
        myMahindra.startEngine();
        myMahindra.stopEngine();

        // Call the method specific to Mahindra class
        myMahindra.offRoadDriving();
    }
}

/*
Output:-
The car engine is starting...
The car engine is stopping...
Mahindra is ready for off-road driving!
*/