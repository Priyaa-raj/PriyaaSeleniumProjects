package week1.day1;

public class Calculator {

	public static void main(String[] args) {
		// Assignment1 
		//Basic Calculator creation
						
		int num1 = 100;
		int num2 = 50;
		
		CalcOperation calc = new CalcOperation();
		
		System.out.println("Addition of "+num1+" and "+num2+" is: "+calc.addition(num1, num2));
		System.out.println("Subraction of "+num1+" and "+num2+" is: "+calc.subraction(num1, num2));
		System.out.println("Multiplication of "+num1+" and "+num2+" is: "+calc.multipliation(num1, num2));
		System.out.println("Division of "+num1+" and "+num2+" is: "+calc.division(num1, num2));
	}

}
