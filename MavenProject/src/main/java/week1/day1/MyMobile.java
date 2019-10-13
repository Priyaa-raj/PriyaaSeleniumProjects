package week1.day1;

public class MyMobile {
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		String myModel = m.model;
		boolean isAndroid = m.isAndroid;
		String os = m.getOs();
		int batterypercent = m.batterypercent();
	
		System.out.println("My Mobile Model is " + myModel);
		System.out.println("Is my mobile Android? " + isAndroid);
		System.out.println("My Mobile OS is " + os);
		System.out.println("My Current Battery is " + batterypercent);
	}

}
