//Q.Write a program to accept 3 digit no from the user and check it is armtrong or not
import java.util.Scanner;

public class ArmStrongOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is a 3-digit number
        if (number >= 100 && number <= 999) {
            // Check if the number is an Armstrong number
            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        } else {
            System.out.println("The number you entered is not a 3-digit number.");
        }

        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        return sum == originalNumber;
    }
}

/*
Output 1:-
Enter a 3-digit number: 323
323 is not an Armstrong number.

Output 2:-
Enter a 3-digit number: 371
371 is an Armstrong number.

*/