package notes;

import java.util.Scanner;

public class LargestofNNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		int maxValue=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			int current=sc.nextInt();
			maxValue=Math.max(maxValue, current);
		}
		System.out.println(maxValue);
	}

}
