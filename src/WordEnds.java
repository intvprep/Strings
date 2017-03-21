


//Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
//
//wordEnds("abcXY123XYijk", "XY") -> "c13i"
//wordEnds("XY123XY", "XY") -> "13"
//wordEnds("XY1XY", "XY") -> "11"
public class WordEnds {
	
	
	public static void main(String[] args) {
		System.out.println(wordEnds("abcXY123XYijk", "XY"));
		System.out.println(wordEnds("XY123XY", "XY"));
		System.out.println(wordEnds("XY1XY", "XY"));
	}
	public static String wordEnds(String text, String word){
		
		String toReturn = "";
		int fromIndex = 0;
		while(text.indexOf(word, fromIndex)!=-1){
			int t = text.indexOf(word, fromIndex);
			if(t>0)
				toReturn+=text.charAt(t-1);
			if(t+word.length() < text.length())
				toReturn+=text.charAt(t+word.length());
			fromIndex = t+word.length();
		}
		
		return toReturn;
	}
	
	public static String wordEnds2(String str, String word ){
		String toReturn ="";
		
		
		return toReturn;
	}
}
