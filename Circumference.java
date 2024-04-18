import java.util.Scanner;
public class Circumference {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double Radius, Circumference;
		System.out.println("Enter the Radius of circle :");
		Radius=sc.nextDouble();
		Circumference= 2* Math.PI*Radius;
		System.out.println("Circumferences Of Circle :" +Circumference);
	
	
	}

}
