//Q.Write a program to print palindrome number
 import java.util.Scanner; //import the Scanner class to read input

public class Pallindrome {

	public static void main(String[] args) {
		
		String Original,reverse="";   	//Declare variables
	
		Scanner sc=new Scanner(System.in);	//Create a Scanner object to read input
		System.out.println("Enter a String or Number :");
		
		Original=sc.nextLine();   //read the String or number
		int length=Original.length();  //get the length of input string
		
		for(int i=length-1;i>=0;i--) 	//Loop from the end to the start of the string
			reverse=reverse+Original.charAt(i);  //Append each character to the string 
		
		if(Original.equals(reverse))   //check if the original string is equal to the reverse string
			
			System.out.println("Entered String or Number is Palindrome :"); //If true,Then print Palindrome
		else {
			System.out.println("Entered String or Number is Not Palindrome"); //If false,Then print Not Palindrome
		}
		
	}

}

//Outputs:

/*
output 1:-
Enter a String or Number :
232
Entered String or Number is Palindrome 

output 2:-
Enter a String or Number :
Gayatri
Entered String or Number is Not Palindrome
*/