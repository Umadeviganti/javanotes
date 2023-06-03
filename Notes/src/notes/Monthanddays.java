package notes;

import java.util.Scanner;

public class Monthanddays {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter valid month no ");
		
		//if break is not included in the switch statements in will under go the "fall through" where it continuously execute the statements 
		int month=sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("January");
			System.out.println("The no of days is 31");
			break;
		case 2:
			System.out.println("Febuary");
			System.out.println("The no of days is 28 or 29");
			break;
		case 3:
			System.out.println("March");
			System.out.println("The no of days is 31");
			break;
		case 4:
			System.out.println("April");
			System.out.println("The no of days is 30");
			break;
		case 5:
			System.out.println("May");
			System.out.println("The no of days is 31");
			break;
		case 6:
			System.out.println("June");
			System.out.println("The no of days is 30");
			break;
		case 7:
			System.out.println("July");
			System.out.println("The no of days is 31");
			break;
		case 8:
			System.out.println("August");
			System.out.println("The no of days is 31");
			break;
		case 9:
			System.out.println("September");
			System.out.println("The no of days is 30");
			break;
		case 10:
			System.out.println("October");
			System.out.println("The no of days is 31");
			break;
		case 11:
			System.out.println("November");
			System.out.println("The no of days is 30");
			break;
		case 12:
			System.out.println("December");
			System.out.println("The no of days is 31");
			break;
			
		default: System.out.println("Please enter valid month number");
		}
	}

}
