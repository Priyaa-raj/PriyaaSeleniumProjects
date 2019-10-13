package week1.day1;

public class Fibonacci20 {

	public static void main(String[] args) {
		// Assignment1 
		//Write a java program to print first 20 values of the fibonacci series.
		
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+","+b+",");
		for(int i=0;i<=20;i++)
		{
			c=a+b;
			System.out.print(c+ "," );
			a=b;
			b=c;
			
		}

	}

}
