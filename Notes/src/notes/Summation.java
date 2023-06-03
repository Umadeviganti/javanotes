package notes;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int N= sc.nextInt();
        int sum=0;
        for(int i=0; i<=N; i++){
            sum +=i;
        }
        System.out.println(sum);

	}

}
