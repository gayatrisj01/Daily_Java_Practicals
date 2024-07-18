//Q.Write a Program to display the largest no among three nos.
import java.util.Scanner;  //importing scanner class

public class LargestNum {

	public static void main(String[] args) {
		//declare Variable
		int num1, num2,num3,res;
		
		//Take number From user using Scanner class
		Scanner demo=new Scanner(System.in);
		 
		
		System.out.println("Enter first number :");
		num1=demo.nextInt();
		System.out.println("Enter second number :");
		num2=demo.nextInt();
		System.out.println("Enter Three number :");
		num3=demo.nextInt();
		//give the conditoin using if else
		if(num1>num2) 
		{
			System.out.println("num1 is Greater !");
		}
		if(num2>num3)
		{
			System.out.println("num2 is Grater !");
		}
		else
		{
			System.out.println("num3 is Grater !");
		}
	}

}

/*
output:-
Enter first number :
324
Enter second number :
433
Enter Three number :
645
num3 is Grater !
*/