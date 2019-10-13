package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterCount {

	public static void main(String[] args) {
		// Program to type the occurance of each character in a given String.
		
		// here character is case sensitive
		String name="pPriyaa";
		
		char[] charArray = name.toCharArray();
		
		int length = charArray.length;
		
		Map<Character, Integer> check = new LinkedHashMap<>();
		
		int count=1;
		
		for(int a=0;a<length;a++)
		{
			if(check.containsKey(charArray[a]))
			{
				/*cannot use count ++ here because for each iteration count value is incremeted for if and else.a See example below. 
				P has 2 Occurances
				r has 2 Occurances
				i has 2 Occurances
				y has 2 Occurances
				a has 3 Occurances*/
				//count++;
				//check.put(charArray[a], count);
				//check.get(charArray[a]) - this returns the value of the key - here character [ mapobject.get(key)]
				check.put(charArray[a], check.get(charArray[a])+1);
			}
			else
			{
				check.put(charArray[a], count);
			}
		}
		
		for(Entry<Character, Integer> show : check.entrySet())
		{
			System.out.println(show.getKey()+" has "+show.getValue()+" Occurances");
		}

	}

}
