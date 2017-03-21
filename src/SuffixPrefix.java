import java.util.ArrayList;
import java.util.List;

public class SuffixPrefix {
	
	
	public static void main(String[] args) {
		//System.out.println(getAllSuffix("Ramdas"));
		
		System.out.println(similarityBetweenSuffixes("ababaa"));
	}
	
	public static List<String> getAllSuffix(String str){
		 List<String> list = new ArrayList<>();
		 for(int i=0;i<str.length();i++){
			 list.add(str.substring(i));
		 }
		 return list;
		 //return generateSuffix(str, list);
	}
	
	private static List<String> generateSuffix(String str,List<String> suffixes){
		if(str.length() == 0)
			return suffixes;
		suffixes.add(str);
		return generateSuffix(str.substring(1), suffixes);
	}
	
	public static int similarityBetweenSuffixes(String str){
		
		 List<String> list = new ArrayList<>();
		 for(int i=0;i<str.length();i++){
			 list.add(str.substring(i));
		 }
		 int total =0;
		 for(String suffix : list){
			 int i=0;
			 int similiraty = 0;
			 while(i<suffix.length() && suffix.charAt(i)==str.charAt(i)){
				 similiraty++;
				 i++;
			 }
			 System.out.println(suffix + " " +similiraty);
			 total+=similiraty;
		 }
		
		 
		 return total;
	}
}
