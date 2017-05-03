import java.util.LinkedList;
import java.util.Queue;
//all operators had same precedence and left associativity
//operators = +, -, *
//22*79-21 = 1717
//22+79*21 = 2121
public class SimpleAlgebraicEquation {
	public static void main(String[] args) {
		System.out.println(evaluate("22*79-21"));
		System.out.println(evaluate("22+79*21"));
	}
	
	public static int evaluate(String str){
		char[] arr = str.toCharArray();
		Queue<String> queue = new LinkedList<String>();
		int result = 0;
		for(int i=0;i<arr.length;i++){
			
			char c = arr[i];
			if(Character.isDigit(c)){
				int j;
				for(j=i;j<arr.length;j++){
					if(!Character.isDigit(arr[j]))break;
				}
				result = Integer.parseInt(str.substring(i,j));
				//System.out.println(result);
				queue.offer(str.substring(i,j));
				i = j-1;
				
				continue;
			}
			if(!Character.isDigit(c)){
				queue.offer(""+c);
			}
		}
		
		System.out.println(queue);
		while(!queue.isEmpty()){
			String string = queue.poll();
			if(isInteger(string)){
				result = Integer.parseInt(string);
			}else{
				switch (string){
				case "+": result+=Integer.parseInt(queue.poll());
					break;
				case "-": result-=Integer.parseInt(queue.poll());
					break;
				case "*": result*=Integer.parseInt(queue.poll());
					break;
				}
			}
		}
		return result;
	}
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
}
