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
		int j=0;
		int total = 0;
		String op="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' ){
				if(j==0){
					total = Integer.valueOf(str.substring(j, i));
				}else{
					total = calculate(op, str.substring(j, i), total);
				}
				op = str.substring(i,i+1);
				j=i+1;
			}
		}
		total = calculate(op, str.substring(j), total);
		return total;
	}
	public static int calculate(String op, String number, int total){
		switch(op){
			case "+": total+=Integer.valueOf(number);
			break;
			case "-": total -= Integer.valueOf(number);
			break;
			case "*": total*=Integer.valueOf(number);
			break;
		}
		return total;
	}
}
