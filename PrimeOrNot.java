//Q. Write a program to accept a no from the user and check it is prime no or not
import java.util.Scanner;  
  
public class PrimeOrNot {  
  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
       if (isPrime(n)) {  
           System.out.println(n + " is a prime number");  
       } else {  
           System.out.println(n + " is not a prime number");  
       }  
   }  
  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}  

/*
Output 1:-
Enter a number : 50
50 is not a prime number

Output 2:-
Enter a number : 43
43 is a prime number
*/