

import java.util.Arrays;

public class CodingBatString {

	public static void main(String[] args) {
		// System.out.println(countHi("abc hi ho"));
		//
		// System.out.println(plusOut("12xy34", "xy"));
		// System.out.println(plusOut("12xy34", "1"));
		// System.out.println(plusOut("12xy34xyabcxy", "xy"));
		// System.out.println(xyBalance("aaxbb"));

		// System.out.println(countYZ("aaz yyz my"));
		// System.out.println(gHappy("xxggxx"));
		// System.out.println(countTriple("222abyyycdXXX"));
		//System.out.println("result:: "+sameEnds("xxxx"));
		//System.out.println(withOutString("This is a FISH", "IS"));
		//System.out.println(sameStarChar(""))));
	}

	public static int countHi(String str) {
		int count = 0;
		int fromIndex = 0;
		System.out.println(str.indexOf("hi", fromIndex));
		while (str.indexOf("hi", fromIndex) != -1) {
			count++;
			fromIndex = str.indexOf("hi", fromIndex) + "hi".length();
		}
		return count;
	}

	// plusOut("12xy34", "xy") -> "++xy++"
	// plusOut("12xy34", "1") -> "1+++++"
	// plusOut("12xy34xyabcxy", "xy") -> "++xy++xy+++xy"
	public static String plusOut(String str, String word) {
		StringBuffer b = new StringBuffer();
		int indexOfWord = str.indexOf(word, 0);
		for (int i = 0; i < str.length(); i++) {
			if (i == indexOfWord) {
				b.append(word);
				i = i + word.length() - 1;
				indexOfWord = str.indexOf(word, indexOfWord + word.length());
			} else {
				b.append("+");
			}
		}
		return b.toString();
	}

	// xyBalance("aaxbby") -> true
	// xyBalance("aaxbb") -> false
	// xyBalance("yaaxbb") -> false
	public static boolean xyBalance(String str) {

		int fromIndex = 0;
		while (str.indexOf("x", fromIndex) != -1) {
			fromIndex = str.indexOf("x", fromIndex);
			if (str.indexOf("y", fromIndex + 1) > fromIndex) {
				fromIndex++;
				continue;
			} else {
				return false;
			}

		}
		return true;
	}

	public static int countYZ(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i)) && i > 0) {
				if (Character.toLowerCase(str.charAt(i - 1)) == 'y'
						|| Character.toLowerCase(str.charAt(i - 1)) == 'z') {
					count++;
				}
			}
			if (i == str.length() - 1) {
				if (Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z') {
					count++;
				}
			}
		}

		return count;
	}

	//
	// gHappy("xxggxx") -> true
	// gHappy("xxgxx") -> false
	// gHappy("xxggyygxx") -> false
	//
	public static boolean gHappy(String str) {
		int len = str.length();
		boolean happy = true;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'g') {
				if (i > 0 && str.charAt(i - 1) == 'g')
					happy = true;
				else if (i < len - 1 && str.charAt(i + 1) == 'g')
					happy = true;
				else
					return false;
			}
		}
		return happy;
	}

	public static int countTriple(String str) {
		char[] a = str.toCharArray();
		int triple = 0;
		for (int i = 0; i < a.length - 2; i++) {
			if (a[i] == a[i + 1] && a[i + 2] == a[i])
				triple++;
		}
		return triple;
	}

	public static int sumDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				// sum+=Integer.parseInt(""+str.charAt(i));
				sum += Character.getNumericValue(str.charAt(i));
			}
		}

		return sum;
	}

//	sameEnds("javaXYZjava") -> "java"
	public static String sameEnds(String str) {
		String toReturn = "";
		for (int i = 1; i < str.length(); i++) {
			String subString1 = str.substring(0, i);
			String subString2 = str.substring(str.length()-i, str.length());
			
			System.out.println(subString1+" :: "+subString2);
			if(subString1.equals(subString2)){
				toReturn = subString1;
			}
		}
		return toReturn;
	}
	
	public static String withOutString(String string, String remove){
		
		
		int indexOf = string.toLowerCase().indexOf(remove.toLowerCase());
		
		while(indexOf!=-1){
			string = string.substring(0,indexOf)+string.substring(indexOf+remove.length());
			indexOf = string.toLowerCase().indexOf(remove.toLowerCase());
		}
		
		return string;
		
	}
	
	public static boolean sameStarChar(String str) {
	    boolean result = true;
	    int indexOf = str.indexOf("*");
	    
	    while(indexOf!=-1){
	      if(indexOf == 0 || indexOf == str.length()-1){
	        indexOf = str.indexOf("*",indexOf+1);continue;
	      }
	        
	      if(str.charAt(indexOf-1)==str.charAt(indexOf+1))
	        result&=true;
	      else
	        result&=false;
	        
	      indexOf = str.indexOf("*",indexOf+1);  
	    }
	    
	    return result;
	}

}
