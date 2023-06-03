package notes;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age ");
		int age=sc.nextInt();
		
		String nation= "Indian";
		
		if(age>=18 && nation== "Indian" ) {
			System.out.println("Eligible for Voting");
		}else
			System.out.println("Not eligible for voting");

	}

}
