

public class Permutation{
	
	public static void permutaion(String str){
		 permutation("",str);
	}

	private static void permutation(String prefix, String str){
		if(str.length() == 0){
			System.out.println(prefix);
		}else{
			for (int i=0;i<str.length() ;i++ ) {
				permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1) );
			}
		}
	}

	public static void main(String[] args) {
		permutaion("amita");
	}
}