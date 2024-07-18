//Q.Write a program to Find factorial of a number.
import java.util.Scanner;

public class Factorial_demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		
		int num=sc.nextInt();
		int i=1,fact=1;
		//fact=sc.nextInt();
		while(i<=num) {
			fact=fact*i;
			i++;
		}
			System.out.println("The Factorial of "+num+" is :" +fact);
			
		
	}
}


/*
output:-
Enter number : 
7
The Factorial of 7 is :5040
*/