package notes;

public class StringMethods {

	public static void main(String[] args) {
		String s1= "abc";
		String s2= "abc";
		
		String s3 =new String();
		s3="abc";
		
		String str="Hello World";
		//both will be stored in spring pool
		if(s1==s2) {
			System.out.println("s1 & s2 are equal");
		}
		if(s1==s3) {
			System.out.println("s1 & s3 are equal");
		}else {
			System.out.println("s1 & s3 ar not equal");
		}
		
		System.out.println(str.charAt(6));
		System.out.println(str.length());
		System.out.println(str.indexOf('W'));
		System.out.println(str.indexOf("ll"));
		System.out.println(s3.equals(s2));
		System.out.println(str.concat("hel"));
		System.out.println(str.contains("hel"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("World", "Country"));
		System.out.println(str);
		String s=s1.substring(2);
		System.out.println(s);
		s=str.substring(4,8);
		System.out.println(s);
		s=s1+s2+str;
		System.out.println(s);

	}

}
