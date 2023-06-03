package notes;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		String ans= num%2==0 ? "Even" : "Odd" ;
		System.out.println(ans);

	}

}
