/*Q.Create a class Person with fields name and age and a parameterized constructor to initialize them. 
Then, create a subclass Employee that inherits from Person and has an additional field employeeId. 
Write constructors for the Employee class that initialize its fields and invoke the constructor of the Person class.*/
 // Parent class: Person1

class Person1 {
    // Fields
    protected String name;
    protected int age;

    // Parameterized constructor
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person1 details
    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass: Employee
class Emp extends Person1 {
    // Additional field
    private String employeeId;

    // Parameterized constructor
    public Emp(String name, int age, String employeeId) {
        // Invoke the constructor of the Person1 class
        super(name, age);
        // Initialize the employeeId field
        this.employeeId = employeeId;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        // Display person1 details
        displayPersonInfo();
        // Display employee-specific details
        System.out.println("Employee ID: " + employeeId);
    }
}

// Main class to demonstrate the use of Person and Employee classes
public class PersonEmployee {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Emp emp = new Emp("Gayatri Jadhav", 23, "E29785");

        // Display the employee information
        emp.displayEmployeeInfo();
    }
}
 

/*
Output:- 
Name: Gayatri Jadhav, Age: 23
Employee ID: E29785
*/