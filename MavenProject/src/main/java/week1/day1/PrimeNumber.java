package week1.day1;

//import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Write a java program to print only the prime numbers within 100.
		
		for(int i=2;i<100;i++)
		{
			boolean flag = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = false;
				}
			}
			if(flag == true)
			{
				System.out.println(i);
			}
		}
		
	}
	
}

