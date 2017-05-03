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
		
		Queue<String> queue = new LinkedList<String>();
		int j=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' ){
				queue.offer(str.substring(j, i));
				queue.offer(str.substring(i,i+1));
				j=i+1;
			}
		}
		queue.offer(str.substring(j));
		
		System.out.println(queue);
		int result = 0;
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
