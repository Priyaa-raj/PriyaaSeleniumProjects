package week1.day2;

public class CountOfWordInString {

	public static void main(String[] args) {
		// Classroom Assignment 2
		
		String givenText = "Amazon India Development Centre has been extablished in the year 2004 and has persence in 24 cities in India";
		String search = "India";
		int count = 0;
		String[] splitGiven = givenText.split(" ");
		for (String str : splitGiven) {
			if(str.equals(search))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
