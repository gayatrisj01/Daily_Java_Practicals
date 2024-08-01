// Parent class: Person
class Person{
    // Fields 
    protected String name;
    protected int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display speaking action
    public void speak() {
        System.out.println(name + " is speaking.");
    }
}

// Child class: Student
class Student extends Person {
    // Additional field
    private String grade;

    // Parameterized constructor
    public Student(String name, int age, String grade) {
        super(name, age); // Call to the constructor of the Person class
        this.grade = grade;
    }

    // Method specific to Student
    public void study() {
        System.out.println(name + " is studying in grade " + grade + ".");
    }
}

// Main class to demonstrate the use of Person and Student classes
public class PersonStudent {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student("Gayatri", 20, "A");

        // Call the speak method from Person class using Student object
        student.speak();

        // Call the study method from Student class
        student.study();
    }
}

/*
Output:-
Gayatri is speaking.
Gayatri is studying in grade A.
*/