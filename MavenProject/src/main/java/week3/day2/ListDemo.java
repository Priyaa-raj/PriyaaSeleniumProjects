package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		
		li.add("string1");
		li.add("string2");
		li.add("string3");
		li.add("string4");
		li.add("string5");
		
		for(int a=li.size()-1;a>=0;a--)
		{
			System.out.println(li.get(a));
		}
		
		
	}

}
