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
    
    public static void main(String[] args) {
		LicenseKeyFormatting s = new LicenseKeyFormatting();
		System.out.println(s.licenseKeyFormatting("2-4A0r7-4k", 3));
	}
}

//"2-4A0r7-4k"
//3