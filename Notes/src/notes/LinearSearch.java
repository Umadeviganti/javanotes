package notes;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int key =sc.nextInt();
		int ans =-1;
		//from left to right iteration
		for(int j=0; j<n;j++) {
			if(arr[j]==key) {
			ans=j;
			break;
			}
		}
		System.out.println(ans);
		ans=-1;
		//from right to left iteration
		for(int k=n-1; k>=0;k--) {
			if(arr[k]==key) {
				ans=k;
				break;
			}
		}
		System.out.println(ans);
	}

}
