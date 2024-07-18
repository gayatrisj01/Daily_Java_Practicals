//Q.Write a java Program to print  armstrong number.
public class ArmStrong {
	public static void main(String[] args) {
		
		//Declare the Variable
		int number =371 , originalNumber, remainder, result =0;
		
		originalNumber = number;
		//WE use the while loop with the formula 
		while(originalNumber !=0)
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /=10;
		}
		//if result is equal of the number then print in the if Statement
		if(result == number)
			System.out.println(number + " is an Armstrong number");
		//If if codition is false then print the else Statement
		else
			System.out.println(number + " is not an Armstrong number");
	}
}

/*
output:-
371 is an Armstrong number
*/