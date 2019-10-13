package week1.day2;

import java.util.Scanner;

import week1.day1.CalcOperation;

public class CalculatorSwitch {

	private static Scanner myInput;

	public static void main(String[] args) {
		// Classroom Activity 1
		
		myInput = new Scanner(System.in);
		System.out.println("1.Addition \n2.Sub \n3.Multi \n4.Division");
		System.out.println("Enter your choice of Operation: ");
		
		int choice = myInput.nextInt();
		
		int num1 = 100;
		int num2 = 50;
		
		CalcOperation calc = new CalcOperation();
		
		switch(choice) {
		case 1:
			System.out.println("Addition of "+num1+" and "+num2+" is: "+calc.addition(num1, num2));
			break;
		case 2:
			System.out.println("Subraction of "+num1+" and "+num2+" is: "+calc.subraction(num1, num2));
			break;
		case 3:
			System.out.println("Multiplication of "+num1+" and "+num2+" is: "+calc.multipliation(num1, num2));
			break;
		case 4:
			System.out.println("Division of "+num1+" and "+num2+" is: "+calc.division(num1, num2));
			break;
		default:
			System.out.println("Enter Valid Choice to perform Operation");
			break;
		}
		

	}
	
}
