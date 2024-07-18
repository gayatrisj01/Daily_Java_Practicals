//Q.Write a java program to check given number is perfect number or not
import java.util.Scanner;  // Import the Scanner class to read input

public class PerfectNum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object to read input
        System.out.print("Enter a number: ");  // Prompt the user to enter a number
        int number = sc.nextInt();  // Read the input number
        sc.close();  // Close the scanner

        if (isPerfectNumber(number)) {  // Check if the number is a perfect number
            System.out.println(number + " is a perfect number.");  // Print if the number is perfect
        } else {
            System.out.println(number + " is not a perfect number.");  // Print if the number is not perfect
        }
    }

    // Method to check if a number is perfect
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {  
            return false;  
        }
        
        int sum = 0;  // Initialize sum to store the sum of divisors
        
        // Loop from 1 to half of the number (inclusive)
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {  // Check if i is a divisor of num
                sum += i;  // Add the divisor to the sum
            }
        }
        
        return sum == num;  // Return true if sum of divisors is equal to the number
    }
}