/*Q.Assignment-2. ● Write a Java program that demonstrates method overloading by creating a class called Calculator. 
  ● Add three methods called add().
  ● The first add() method should take two int variables as arguments and return their sum as int.
  ● The second add() method should take three int variables as arguments and return their sum as int. 
  ● The third add() method should take two doubles as arguments and return their sum as double. 
  ● The program should allow the user to display the results of each method.*/
import java.util.Scanner;

public class CalculatorOverloading {

    // First add() method: takes two int variables and returns their sum
    public int add(int a, int b) {
        return a + b;
    }

    // Second add() method: takes three int variables and returns their sum
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Third add() method: takes two double variables and returns their sum
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorOverloading calculator = new CalculatorOverloading();

        // Using the first add() method
        System.out.print("Enter first integer for first add() method: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer for first add() method: ");
        int int2 = scanner.nextInt();
        int result1 = calculator.add(int1, int2);
        System.out.println("Result of first add() method (int, int): " + result1);

        // Using the second add() method
        System.out.print("Enter first integer for second add() method: ");
        int int3 = scanner.nextInt();
        System.out.print("Enter second integer for second add() method: ");
        int int4 = scanner.nextInt();
        System.out.print("Enter third integer for second add() method: ");
        int int5 = scanner.nextInt();
        int result2 = calculator.add(int3, int4, int5);
        System.out.println("Result of second add() method (int, int, int): " + result2);

        // Using the third add() method
        System.out.print("Enter first double for third add() method: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter second double for third add() method: ");
        double double2 = scanner.nextDouble();
        double result3 = calculator.add(double1, double2);
        System.out.println("Result of third add() method (double, double): " + result3);

        scanner.close();
    }
}


/*Output:-
Enter first integer for first add() method: 2
Enter second integer for first add() method: 3
Result of first add() method (int, int): 5
Enter first integer for second add() method: 4
Enter second integer for second add() method: 5
Enter third integer for second add() method: 6
Result of second add() method (int, int, int): 15
Enter first double for third add() method: 4.5
Enter second double for third add() method: 5.4
Result of third add() method (double, double): 9.9
*/