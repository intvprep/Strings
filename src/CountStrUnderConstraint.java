//Given a length n, count the number of strings of length n that can be made using ‘a’, ‘b’ and ‘c’ with at-most one ‘b’ and two ‘c’s allowed.
//
//Examples:
//
//Input : n = 3 
//Output : 19 
//Below strings follow given constraints:
//aaa aab aac aba abc aca acb acc baa
//bac bca bcc caa cab cac cba cbc cca ccb 
//
//Input  : n = 4
//Output : 43
//Asked in Google Interview
public class CountStrUnderConstraint {
	
	public static void main(String[] args) {
		System.out.println(countStr("", 3, 0, 0));
	}
	
	public static int countStr(String str, int n, int bCount, int cCount)
	{
	    // If we find string of length n
	    if (str.length() == n)
	        return 1;
	 
	    // Add 'a' to the string
	    int result = 0 ;
	    result += countStr(str+'a', n, bCount, 0);
	 
	    // Add single 'b' to the string
	    if (bCount == 0)
	        result += countStr(str+'b', n, 1, 0);
	 
	    // Add 'c' to the string if count of 'c' less then '2'
	    if (cCount < 2)
	        result += countStr(str+'c', n, bCount, cCount+1);
	 
	    // return total count
	    return result ;
	}
}
