package notes;

public class FindNoinArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int key=3;
		boolean found=false;
		for(int num :arr) {
			if(num==key) {
				found=true;
				break;
			}
			
		}
		if(found) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}

	}

}
