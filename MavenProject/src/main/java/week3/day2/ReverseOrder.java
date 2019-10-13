package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ReverseOrder {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		
		ls.add("HCL");
		ls.add("CTS");
		ls.add("Aspire Systems");
		
		for(int i=ls.size()-1;i>=0;i--)
		{
			System.out.println(ls.get(i));
		}
		

	}

}
