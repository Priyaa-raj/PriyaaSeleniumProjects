package week1.day2;

public class PrintLowerCase {

	public static void main(String[] args) {
		// Classroom Assignment 3
		
	String input = "AmaZon";
	
	char[] charArray = input.toCharArray();
	for (char c : charArray) {
		int a=c;
		if(a>=97)
		{
			System.out.print(c);
		}
		
	}
	
	//Method 1
	
	/*char[] originalCharArray = input.toCharArray();
	String lowerCaseInput = input.toLowerCase();
	char[] lowerCharArray = lowerCaseInput.toCharArray();
	for(int i=0;i<input.length();i++)
	{
		if(originalCharArray[i]==lowerCharArray[i])
		{
			System.out.print(originalCharArray[i]);
		}
	}*/
	
	
		
	}

}
