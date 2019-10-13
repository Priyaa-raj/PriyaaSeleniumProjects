package week1.day1;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		//Assignment1  
		//Write a java program to print the sum of odd number upto 100.
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
          System.out.println(sum);
	}

}
