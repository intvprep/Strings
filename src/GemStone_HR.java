import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GemStone_HR {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	InputStream iStream = new FileInputStream("c:/tmp/gem_stone_hc.txt");
        Scanner scan = new Scanner(iStream);
        int n = scan.nextInt();
        String[] arr = new String[n];
        int minIndx=0;
        int minLen=0;
        int gem = 0;
        for(int i=0;i<n;i++){
            arr[i] = scan.next();
            if(minLen>arr[i].length()){
                minLen = arr[i].length();
                minIndx = i;
            }
        }
        System.out.println(arr[minIndx]);
        Set<Character> set = new HashSet<>();
        for(int i=0;i<arr[minIndx].length();i++){
            char c = arr[minIndx].charAt(i);
            int count = 0;
            myb:
            for(int j=0;j<n;j++){
                if(arr[j].indexOf(c) != -1){
                    count++;
                }else{
                  break myb;
                }
            }
             
            if(count == n){
            	set.add(c);
            	gem++;
            }
        }
        
        System.out.println(set.size());
            
    }

}
