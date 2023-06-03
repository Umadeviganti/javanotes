package notes;


import java.util.Arrays;
import java.util.Scanner;

public class SquaresofArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no ");
		
		int N=sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N;i++) {
			arr[i]=(i+1)*(i+1);
		System.out.println(arr[i]);	
		}
		System.out.println(Arrays.toString(arr));	
	}

}
