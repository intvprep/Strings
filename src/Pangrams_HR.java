import java.util.Arrays;
import java.util.Scanner;

public class Pangrams_HR {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] a = str.toLowerCase().toCharArray();
        boolean[] arr = new boolean[26];
        Arrays.fill(arr,false);
        for(int i=0;i<a.length;i++){
            if(a[i]==' ')continue;;
            arr[a[i]-97]=true;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}
