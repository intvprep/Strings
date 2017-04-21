

public class SubString {

	
	public static void main(String[] args) {
		System.out.println(subString("aaaaddddbbddd", "aad"));
	}
	
	public static int subString(String txt, String pattern){
		
		if(pattern.length() > txt.length()) return -1;
		
		char[] searchIn = txt.toCharArray();
		char[] search = pattern.toCharArray();
		
		for (int i = 0; i < searchIn.length; i++) {
			int k=0;
			boolean continu = true;
			while(k<search.length && continu){
				continu = search[k]==searchIn[i+k];
				if(continu)k++;
			}
			if(k == search.length) return i;
		}
		return -1;
		
	}
}	
