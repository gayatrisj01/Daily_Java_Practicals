import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		
		int Length, Breadth, area;
		int PArea;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of rectangle :");
		Length=sc.nextInt ();
		System.out.println("Enter Breadth of rectangle :");
		Breadth=sc.nextInt ();
		System.out.println("The Area of Rectangle");
		area = Length*Breadth;
		System.out.println("The Area of Rectangle :" +area);
		PArea=2*(Length+Breadth);
		System.out.println("The Total Perimeter Area of Rectangle : " +PArea);
	}

}
