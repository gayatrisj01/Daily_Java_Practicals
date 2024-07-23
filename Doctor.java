//Q.Create a program in java to implement multilevel inheritance and hierarchical inheritance.  Take classes like: Doctor, Surgeon and Nurse
// Base class: Doctor
class Doctor1 {
    // Fields
    protected String name;
    protected int age;

    // Parameterized constructor
    public Doctor1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display doctor's details
    public void diagnose() {
        System.out.println("Dr. " + name + " is diagnosing patients.");
    }

    // Method to display general info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class: Surgeon (Multilevel Inheritance)
class Surgeon extends Doctor1 {
    // Parameterized constructor
    public Surgeon(String name, int age) {
        super(name, age);
    }

    // Method specific to Surgeon
    public void performSurgery() {
        System.out.println("Dr. " + name + " is performing surgery.");
    }
}

// Derived class: Nurse (Hierarchical Inheritance)
class Nurse extends Doctor1 {
    // Parameterized constructor
    public Nurse(String name, int age) {
        super(name, age);
    }

    // Method specific to Nurse
    public void assist() {
        System.out.println("Nurse " + name + " is assisting in patient care.");
    }
}

// Main class to demonstrate the use of Doctor, Surgeon, and Nurse classes
public class Doctor {
    public static void main(String[] args) {
        // Create an object of the Surgeon class
        Surgeon surgeon = new Surgeon("Sonal mishra", 35);
        surgeon.displayInfo();
        surgeon.diagnose();
        surgeon.performSurgery();

        System.out.println();

        // Create an object of the Nurse class
        Nurse nurse = new Nurse("Priti chavan", 30);
        nurse.displayInfo();
        nurse.diagnose();
        nurse.assist();
    }
}


/*
Output :-
Name: Sonal mishra, Age: 35
Dr. Sonal mishra is diagnosing patients.
Dr. Sonal mishra is performing surgery.

Name: Priti chavan, Age: 30
Dr. Priti chavan is diagnosing patients.
Nurse Priti chavan is assisting in patient care.
*/