

public class DoubleChar {
	public static void main(String[] args) {
		System.out.println(doubleChar("Hi-There"));
		System.out.println(doubleCharWithArray("Hi-There"));
	}
	public static String doubleChar(String str){
		StringBuffer b = new StringBuffer(str.length()*2);
		for(int i=0;i<str.length();i++){
			b.append(str.charAt(i)).append(str.charAt(i));
		}
		return b.toString();
	}
	
	public static String doubleCharWithArray(String str){
	  	char[] arr = new char[str.length()*2];
			for(int i=0;i<str.length();i++){
				arr[i*2] = str.charAt(i);
				arr[i*2+1] = str.charAt(i);
			}
			return new String(arr);
	}
}
