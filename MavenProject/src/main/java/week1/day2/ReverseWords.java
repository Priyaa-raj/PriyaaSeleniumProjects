package week1.day2;

public class ReverseWords {

	public static void main(String[] args) {
		// reverse words in string from " I am a Software tester" to "I ma a erawtfoS retset"
		
		String input = new String("I am a Software Tester");
		
		String[] split = input.split("\\s+");
		
		int length = split.length;
		
		StringBuffer tempmain = new StringBuffer();
		StringBuffer temp = new StringBuffer();
		
		for(int i=0;i<length;i++)
		{			
			if(i%2!=0)
			{
				tempmain.append(temp.append(split[i]).reverse());
				tempmain.append(" ");
			}
			else
			{
				tempmain.append(temp.append(split[i]));
				tempmain.append(" ");
			}
			temp = new StringBuffer();
		}	
		System.out.print(tempmain);
	}
}
	
