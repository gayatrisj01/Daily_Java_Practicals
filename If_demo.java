import java.util.Scanner;

public class If_demo {

	public static void main(String[] args) {
		int num1, num2,res;
		Scanner demo=new Scanner(System.in);
		 
		System.out.println("Enter first number :");
		num1=demo.nextInt();
		System.out.println("Enter second number :");
		num2=demo.nextInt();
		
		if(num1>num2) 
		{
			System.out.println("num1 is Greater !");
		}
		else
		{
			System.out.println("num2 is Grater !");
		}
	}

}
