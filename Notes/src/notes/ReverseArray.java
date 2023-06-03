package notes;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr2[]=new int[5];
		int j=0;
		for(int i=4;i>=0;i--) {
			arr2[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(arr2));

	}

}
