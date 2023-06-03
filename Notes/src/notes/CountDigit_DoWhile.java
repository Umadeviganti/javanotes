package notes;

import java.util.Scanner;

public class CountDigit_DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int digits=0;
		while(num>0) {
			num/=10;
			digits++;
			
		}
		System.out.println("The length of the no is " + digits);
	}

}
