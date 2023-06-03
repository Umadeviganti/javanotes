package notes;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateCommonArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first Array ");
		
		int n1= sc.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter the elements of the first array ");
		for(int i=0; i<n1; i++) {
			arr1[i]=sc.nextInt();
			//System.out.println("The elemnts of the first array are" + Arrays.toString(arr1));
		}
		System.out.println("The elements of the first array are" + Arrays.toString(arr1));
		System.out.println("Enter the size of second Array ");
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		
		System.out.println("Enter the elements of the second array ");
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("The elements of the second array are" + Arrays.toString(arr2));
		
		int max=Math.max(n1, n2);
		int arr3[]=new int[max];
		int commonindex=0;
		for(int k=0;k<n1;k++) {
			for(int j=0;j<n2;j++) {
			if(arr1[k]==arr2[j]) {
				arr3[commonindex]=arr1[k];
				commonindex++;
				break;
			}
			}
		}
		System.out.println("The third array with common numbers is "+Arrays.toString(arr3));
	}

}
