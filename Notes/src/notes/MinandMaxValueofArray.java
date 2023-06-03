package notes;

public class MinandMaxValueofArray {
	public static void main(String[] args) {
		
		int arr[]= {2,4,5,7,9};
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<5;i++) {
			int current =arr[i];
			max=Math.max(max, current);
		}
		//System.out.println("Max value is "+ max);
		for(int j=0; j<5;j++) {
			int curr=arr[j];
			min=Math.min(min, curr);
		}
		System.out.println("Max value is "+ max);
		System.out.println("Min value is "+ min);
	}

}
//another approach

//        int[] array = {5, 3, 8, 2, 9, 1};
//        int min = array[0];
//        int max = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//
//        System.out.println("Minimum element: " + min);
//        System.out.println("Maximum element: " + max);
//}}