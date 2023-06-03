package notes;

import java.util.Scanner;

public class Check_Array_Sort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		
		int n1=sc.nextInt();
		int arr[]=new int[n1];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//System.out.println(arr);
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i]<=arr[i+1]) {
				System.out.println(1);
				break;
			}else {
				System.out.println(0);
				break;
			}
		}
	}

}
