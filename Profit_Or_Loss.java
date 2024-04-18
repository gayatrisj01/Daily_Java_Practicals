import java.util.Scanner;

public class Profit_Or_Loss {

	public static void main(String[] args) {
		float SalesAmount,Unitprice,Amount;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please Enter the Actual Product Cost :");
		Unitprice = sc.nextFloat();
		
		System.out.println("Please Enter the selling price :" );
		SalesAmount = sc.nextFloat();
		if(SalesAmount > Unitprice) {
			Amount = SalesAmount - Unitprice;
			System.out.println("\n Profit Amount = "+Amount);
		}
		else if(Unitprice > SalesAmount) {
			Amount = Unitprice - SalesAmount;
			System.out.println("\n Loss Amount =" +Amount);
		}
		else {
			System.out.println("\n No Profit No Loss !");
		}
	}

}
