import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[10];

        // Prompting user to input ten integers
        System.out.println("Please enter ten integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            integers[i] = scanner.nextInt();
        }

        // Initializing min and max variables
        int min = integers[0];
        int max = integers[0];

        // Finding the smallest and largest values in the array
        for (int i = 1; i < 10; i++) {
            if (integers[i] < min) {
                min = integers[i];
            }
            if (integers[i] > max) {
                max = integers[i];
            }
        }

        // Displaying the smallest and largest values
        System.out.println("The smallest value is: " + min);
        System.out.println("The largest value is: " + max);

        scanner.close();
    }
}


/* 
Output:-
Please enter ten integers:
Enter integer 1: 23
Enter integer 2: 56
Enter integer 3: 67
Enter integer 4: 34
Enter integer 5: 65
Enter integer 6: 32
Enter integer 7: 97
Enter integer 8: 56
Enter integer 9: 32
Enter integer 10: 56
The smallest value is: 23
The largest value is: 97
*/