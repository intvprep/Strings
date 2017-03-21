
public class StringRotation {
	
	//Ramdas -> rotate by 1 -> amdasR
	//Ramdas -> rotate by 2 -> mdasRa
	public static String rotateClockwise(String s, int offset){
		int i = offset % s.length();
		return s.substring(i) + s.substring(0, i);
	}
	
	//Ramdas -> rotate by 1 -> sRamda
	//Ramdas -> rotate by 2 -> saRamd
	public static String rotateAntiClockWise(String s, int offset){
		int i = offset%s.length();
		StringBuffer prefix = new StringBuffer();
		for(int j=0;j<i;j++){
			prefix.append(s.charAt(s.length()-1-j));
		}
		return prefix.append(s.substring(0, s.length()-i)).toString();
	}

	//Better version of above method
	public static String rotateAntiClockWise2(String s, int offset){
	    int i = s.length() - (offset % s.length());
	    StringBuffer prefix = new StringBuffer(s.substring(i));
	    return prefix.reverse().append(s.substring(0, i)).toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(rotateClockwise("Ramdas", 2));
		System.out.println(rotateAntiClockWise("LeetCode", 2));
	}
}
