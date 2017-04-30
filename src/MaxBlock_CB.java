

//Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
//
//maxBlock("hoopla") -> 2
//maxBlock("abbCCCddBBBxx") -> 3
//maxBlock("") -> 0
public class MaxBlock_CB {
	
	public static void main(String[] args) {
		System.out.println(maxBlock("abbCCCddBBBxx"));
	}
	public static int maxBlock(String str) {
		  if(str == null || str.length()==0) return 0;
		  char[] arr = str.toCharArray();
		  int block = 1;
		  int maxBlock = 0;
		  char prev = arr[0];
		  for(int i=1;i<arr.length;i++){
		    if(arr[i]==arr[i-1]){
		      block++;
		    }else{
		      block = 1;
		    }
		    maxBlock = Math.max(block,maxBlock);
		  }		  
		  return maxBlock;
		}
}
