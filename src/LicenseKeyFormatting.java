public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int K) {
        s = s.replaceAll("-","");
        StringBuffer sb = new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(Character.toUpperCase(s.charAt(i)));
            if(i%(K)==0 && i>0){
            	System.out.println(i);
            	sb.append("-");
            }
        }
        
        return sb.reverse().toString();
    }
    
    //from leetcode
    public String licenseKeyFormatting2(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            if (s.charAt(i) != '-')
                sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
        return sb.reverse().toString().toUpperCase();
    } 
     
    public static void main(String[] args) {
		LicenseKeyFormatting s = new LicenseKeyFormatting();
		System.out.println(s.licenseKeyFormatting("2-4A0r7-4k", 3));
		System.out.println(s.licenseKeyFormatting2("2-4A0r7-4k", 3));
	}
}

//"2-4A0r7-4k"
//3