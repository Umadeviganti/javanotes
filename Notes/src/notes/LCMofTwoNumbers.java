package notes;

import java.util.Scanner;

public class LCMofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the two spaced integer numbers ");
		
		String input=sc.nextLine();
		String[] numbers=input.split(" ");
		
		int a=Integer.parseInt(numbers[0]);
		int b=Integer.parseInt(numbers[1]);
		
		int max=Math.max(a, b);
		int lcm=max;
		
		while(true) {
			if (lcm%a==0 && lcm%b==0)
				break;
			lcm+=max;
		}
		System.out.println("The LCM of " +a +","+b +" is " +lcm);
			
		
	}

}
