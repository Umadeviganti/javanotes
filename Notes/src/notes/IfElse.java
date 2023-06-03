package notes;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number ");
		int no=sc.nextInt();
		if(no>0) {
			System.out.println("Number is Positive");
		}else if (no<0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is Zero");
		}

	}

}
