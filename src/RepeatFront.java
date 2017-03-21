

public class RepeatFront {


	public static String repeatFront(String str, int n){
		if(n==0)return"";
		return str.substring(0,n)+repeatFront(str, n-1);
	}

	public static void main(String[] args) {
		System.out.println(repeatFront("Chocolate", 4));
		System.out.println(repeatFront("Chocolate", 3));
		System.out.println(repeatFront("Ice Cream", 2));
	}
}
