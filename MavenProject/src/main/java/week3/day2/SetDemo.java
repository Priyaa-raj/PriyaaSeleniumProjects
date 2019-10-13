package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> so = new LinkedHashSet<>();
		
		so.add("Priyaa");
		so.add("Shalena");
		so.add("Dhivya");
		so.add("Ritu");
		so.add("swani");
		
		for (String value : so) {
			
			if(value.startsWith("S")||value.startsWith("s"))
			{
				System.out.println(value);
			}
			
		}
	}

}
