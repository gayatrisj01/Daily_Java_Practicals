import java.util.Scanner;

public class FindingEvenNoBetween {

 public static void main(String[] args) {
     // Variables declare
     int Min, Max;

     // Scanner object to read input from the user
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Min No :");
     Min = sc.nextInt();

     System.out.println("Enter Max No :");
     Max = sc.nextInt();
     
     // Loop from the minimum to the maximum number
     while (Min <= Max) {
         // Check if the current number is even
         if (Min % 2 == 0) {
             // Print the even number
             System.out.println("Even Number is " + Min);
         }
         // Increment the minimum number to check the next number in the range
         Min++;
     }
     
     // Close the scanner object to prevent resource leaks
     sc.close();
 }
}

//Output:
/*
 Enter Min No :
10
Enter Max No :
30
Even Number is 10
Even Number is 12
Even Number is 14
Even Number is 16
Even Number is 18
Even Number is 20
Even Number is 22
Even Number is 24
Even Number is 26
Even Number is 28
Even Number is 30
 */
