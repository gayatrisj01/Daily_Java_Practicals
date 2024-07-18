//Q.Write a program to print prime number  series.
import java.util.Scanner;  
public class PrimeNum {  
   public static void main(String[] args) { 
	   //crate a Scanner object to read input
       Scanner sc = new Scanner(System.in); 
       //Read the Starting number and ending number
       System.out.print("Enter the first number : ");  
       int start = sc.nextInt();  
       System.out.print("Enter the second number : ");  
       int end = sc.nextInt(); 
     
       System.out.println("List of prime numbers between " + start + " and " + end);  
       
       //loop through the start to end
       for (int i = start; i <= end; i++) {  
           if (isPrime(i)) {      //check the current number is prime 
               System.out.println(i);  
           }  
       }  
   }  
   public static boolean isPrime(int n) {  
	   //Check the condition 
       if (n <= 1) {  
           return false;   
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  	//If no divisors are found ,n is prime
   }  
}
		