package notes;

import java.util.Scanner;

public class VowelorConsonent {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a letter ");
		
		char l=sc.next().charAt(0);
		switch(l) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Entered letter is vowel");
			break;
		default :
			System.out.println("Entered letter is consonent");
			
		}

	}

}
