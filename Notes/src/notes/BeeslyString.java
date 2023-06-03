package notes;

public class BeeslyString {

	public static void main(String[] args) {
		//String A="pampampam";
		String A="mpampamm";
		int pCount=0, aCount=0, mCount=0;
		
		for(char c :A.toCharArray()) {
			if(c=='p') {
				pCount++;
			}else if(c=='a') {
				aCount++;
			}else if(c=='m'){
				mCount++;
			}
		}
	
		while (true) {
            if (pCount >= 1 && mCount >= 1) {
                pCount--;
                mCount--;
            } else if (aCount >= 1 && mCount >= 1) {
                aCount--;
                mCount--;
            } else {
                break;
            }
            if(A.isEmpty()) {
            	System.out.println(1);
            }
		}
		System.out.println(0);
	}

}
