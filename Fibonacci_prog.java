//Q. Write a program to display fibonacci series fro 0 to 78 eg(0 1 1 2 3 5 8-----)
class Fibonacci_prog {

	public static void main(String[] args)
	{
		int num1=0,num2=1,num3,i,count=10;

		System.out.println(+num1+" "+num2); //Printing 0 and 1
		
		
		for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
		{
			num3=num1+num2;	//In num3 Add summation of previous two numbers
			System.out.println(" "+num3);
			num1=num2;
			num2=num3;
		}
	}
}



/*
Output:-
0 1
1
2
3
5
8
13
*/