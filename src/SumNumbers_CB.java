
//Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//
//sumNumbers("abc123xyz") -> 123
//sumNumbers("aa11b33") -> 44
//sumNumbers("7 11") -> 18
public class SumNumbers_CB {
	public static void main(String[] args) {
		System.out.println(sumNumbers("aa11b33"));
	}
	
	public static int sumNumbers(String str) {
		  char[] a = str.toCharArray();
		  boolean startNum = false;
		  int numIndex = -1;
		  int total = 0;
		  for(int i=0;i<a.length;i++){
		    if(Character.isDigit(a[i])){
		    	if(!startNum){
			      startNum = true;
			      numIndex = i;
		    	}
		    }else{
		      if(startNum){
		        total+=Integer.parseInt(str.substring(numIndex,i));
		        startNum = false;
		        numIndex = -1;
		      }
		    }
		  }
		  return total;
		}
}
