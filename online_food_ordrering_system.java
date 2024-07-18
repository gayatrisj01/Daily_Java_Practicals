//Q. Craete an application using conditional statment and looping statment Food Ordering System.
/*do while loop:

syntax:

do
{
	Statment block;
}
while(Condition);*/

import java.util.Scanner;

public class online_food_ordrering_system
{
	public static void main(String[] args) 
	{	
		//declare the Variales and  Choice
		int choice,choice2,total=0;
		char ans;
		String order="";
		//Take choice number From user using Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Nisarg Hotel");  //print the hotel name
		do
		{
			//Print the dish menu page 
			System.out.println("Menu.");
			System.out.println("1.Starters");
			System.out.println("2.Main Course");
			System.out.println("3. Deserts");
			System.out.println("4.SoftDrinks");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
					//Print the Starter Page 
					System.out.println("1.French Fry  		\t\t\t RS.120");
					System.out.println("2.Paneer crispy 	\t\t RS.140");
					System.out.println("3.Lollypop Dry		\t\t\t RS.160");
					System.out.println("4.crispy Corn		\t\t\t RS.180");
					System.out.println("5.Finger Chips 		\t\t\t RS.150");
					
					choice2=sc.nextInt();
				
					switch(choice2)
					{
					case 1:
						total+=120;
						order+="\nFrench Fry \t RS.120";
						break;
					case 2:
							total+=140;
							order+="\nPaneer crispy \t RS.140";
							break;
					case 3:
						total+=160;
						order+="\nLollypop Dry \t RS.160";
						break;
					case 4:
						total+=180;
						order+="\nCrispy Corn  \t RS.180";
						break;
					case 5:
						total+=150;
						order+="\nFinger Chips \t RS.150";
						break;
					}
					
				break;
			case 2:
				//print the Main course dishes
				System.out.println("1.Kadai Paneer    	 \t\t\t RS.120");
				System.out.println("2.Kaju curry      	 \t\t\t RS.140");
				System.out.println("3.Mutton curry    	 \t\t\t RS.160");
				System.out.println("4.Veg Diwani Hand	 \t\t\t RS.180");
				System.out.println("5.Kadai Chicken	 	 \t\t\t RS.180");
				choice2=sc.nextInt();
				switch(choice2)
				{
				case 1:
					total+=120;
					order+="\nKadai Paneer  \t RS.120";
					break;
				case 2:
						total+=140;
						order+="\nKaju curry \t RS.140";
						break;
				case 3:
					total+=160;
					order+="\nMutton curry \t RS.160";
					break;
				case 4:
					total+=180;
					order+="\nVeg Diwani Handi \t RS.180";
					break;
				case 5:
					total+=180;
					order+="\nKadai Chicken	 \t RS.180";
					break;
				}
			break;
			case 3:
				//Print the Dessert List
				System.out.println("1.Strawberry Cake       \t\t\t RS.120");
				System.out.println("2.Chocolate Crep Cake   \t\t\t RS.140");
				System.out.println("3.Special Muffins  		\t\t\t RS.160");
				System.out.println("4.peanut butter scotch	\t\t\t RS.160");
				System.out.println("5.Vanilla Ice-cream	    \t\t\t RS.180");
				choice2=sc.nextInt();
				switch(choice2)
				{
				case 1:
					total+=120;
					order+="\nStrawberry Cake  \t RS.120";
					break;
				case 2:
						total+=140;
						order+="\nChocolate Crep Cake \t RS.140";
						break;
				case 3:
					total+=160;
					order+="\nSpecial Muffins  \t RS.160";
					break;
				case 4:
					total+=160;
					order+="\npeanut butter scotch \t RS.180";
					break;
				case 5:
					total+=180;
					order+="\nVanilla Ice-cream \t RS.180";
					break;
				}
			break;
			case 4:
				//Print the SoftDrinks list
				System.out.println("1.Tea 		     \t\t\t RS.120");
				System.out.println("2.Coffee		 \t\t\t RS.140");
				System.out.println("3.Lassi 		 \t\t\t RS.160");
				System.out.println("4.SoftDrinks	 \t\t\t RS.180");
				choice2=sc.nextInt();
				switch(choice2)
				{
				case 1:
					total+=120;
					order+="\nTea  \t RS.120";
					break;
				case 2:
						total+=140;
						order+="\nCoffee \t RS.140";
						break;
				case 3:
					total+=160;
					order+="\nLassi \t RS.160";
					break;
				case 4:
					total+=180;
					order+="\nSoftDrinks \t RS.180";
					break;
				}
			break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			
			System.out.println("Do you want to add any other ITEm YES/NO");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		System.out.println("Thanks for coming :) \nVisit Again");
		System.out.println("Your Orders:\n"+order);
		System.out.println("Your total Bill amount is : "+total);
		System.out.println("Pay by Gpay or CASH");
	}

}


/*Output :-
Welcome to Nisarg Hotel
Menu.
1.Starters
2.Main Course
3. Deserts
4.SoftDrinks
1
1.French Fry  					 RS.120
2.Paneer crispy 	    		 RS.140
3.Lollypop Dry					 RS.160
4.crispy Corn					 RS.180
5.Finger Chips 					 RS.150
5
Do you want to add any other ITEm YES/NO
y
Menu.
1.Starters
2.Main Course
3. Deserts
4.SoftDrinks
3
1.Strawberry Cake       			 RS.120
2.Chocolate Crep Cake   			 RS.140
3.Special Muffins  					 RS.160
4.peanut butter scotch				 RS.160
5.Vanilla Ice-cream	    			 RS.180
2
Do you want to add any other ITEm YES/NO
yes
Menu.
1.Starters
2.Main Course
3. Deserts
4.SoftDrinks
4
1.Tea 		     			 RS.120
2.Coffee		 			 RS.140
3.Lassi 		 			 RS.160
4.SoftDrinks	 			 RS.180
3
Do you want to add any other ITEm YES/NO
yes
Menu.
1.Starters
2.Main Course
3. Deserts
4.SoftDrinks
2
1.Kadai Paneer    	 			 RS.120
2.Kaju curry      	 			 RS.140
3.Mutton curry    	 			 RS.160
4.Veg Diwani Hand	 			 RS.180
5.Kadai Chicken	 	 			 RS.180
4
Do you want to add any other ITEm YES/NO
no
Thanks for coming :) 
Visit Again
Your Orders:

Finger Chips 			 RS.150
Chocolate Crep Cake  	 RS.140
Lassi 					 RS.160
Veg Diwani Handi 		 RS.180
Your total Bill amount is : 630
Pay by Gpay or CASH

 */



