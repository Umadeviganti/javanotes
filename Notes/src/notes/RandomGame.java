package notes;

public class RandomGame {

	public static void main(String[] args) {
		while(true) {
			int num= (int)(Math.random()*10+1);
			if(num==5)
			break;
			if(num%4==0) {
				System.out.println("Hello");
				continue;
			}
			System.out.println(num +" ");
		}

	}

}
