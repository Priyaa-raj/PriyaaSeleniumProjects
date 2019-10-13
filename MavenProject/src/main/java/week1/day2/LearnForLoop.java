package week1.day2;

public class LearnForLoop {

	public static void main(String[] args) {
		// Classroom activity 2
		// 5 Employee Name , Print with For and For Each
		
		String[] empName = {"John", "Mary", "Alice", "Azim", "Khan"};
		
//		for(int i=0; i<empName.length;i++)
//		{
//			System.out.println((i+1)+ " Employee Name is "+empName[i]);
//		}
		
		for(String name : empName)
		{
			System.out.println("Employee Name is "+name);
		}

	}

}
