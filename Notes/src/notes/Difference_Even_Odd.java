package notes;

import java.util.Arrays;

public class Difference_Even_Odd {

	public static void main(String[] args) {
		int arr[]={56,63,87,24,32,13,15,19,44,52};
		int max=arr.length;
	    int even[]=new int[max];
	    int odd[]=new int[max];
	    int commonindex=0;
	    int evensum=0;
	    int oddsum=0;
	    for(int i=0; i<arr.length; i++){
	        if(arr[i]%2==0){
	            even[commonindex]=arr[i];
	            evensum=evensum+arr[i];
	            commonindex++;
	            
	        }else {
	        	odd[commonindex]=arr[i];
	        	oddsum=oddsum+arr[i];
	        	commonindex++;
	        	
	        }
	    }
	    System.out.println(evensum);
	    System.out.println(oddsum);
	    int diff=0;
	    diff=evensum-oddsum;
	    System.out.println("The diff between even & odd elements is "+ diff);
	}

}
