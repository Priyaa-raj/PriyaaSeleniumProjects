package week1.day1;

public class GreatestNumber {

	public static void main(String[] args) {
		// Homework 2
		
		int num1 = 10,num2 = 40,num3 = 30;
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("Greatest number is " + num1);
		}
		else if(num2>num3)
		{
			System.out.println("Greatest number is " + num2);
		}
		else
		{
			System.out.println("Greatest number is " + num3);
		}
		

	}

}
