package notes;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		String s="";
		
		for(int i=0; i<str.length();i++) {
			if(i==0 ||str.charAt(i)!=str.charAt(0)) {
				s +=str.charAt(i);
			}else {
				s+="$";
			}
		}
		System.out.println(s);
	}

}
