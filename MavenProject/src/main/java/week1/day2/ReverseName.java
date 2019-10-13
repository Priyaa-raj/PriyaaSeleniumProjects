package week1.day2;

public class ReverseName {

	public static void main(String[] args) {
		// Classroom Assignment 1
		
		String givenText="shanmuga priyaa selvaraj";
		char[] charArray = givenText.toCharArray();
		
		//method 1
//		String reverse = "";
//		
//		for(int i=givenText.length()-1;i>=0;i--)
//		{
//			reverse = reverse + charArray[i];
//	}
//					
//     System.out.print(reverse);
		
		
		//method2
		for(int i=givenText.length()-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
}
}

