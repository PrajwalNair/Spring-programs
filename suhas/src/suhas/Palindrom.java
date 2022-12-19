package suhas;

public class Palindrom {
	
		
	
	static public String printSubStr(String str,int low,int high) {
		if(low>high)
			return null;
		
		while(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high)) {
			low--;
			high++;
		}
		return str.substring(low +1,high);
	}
	
	public static String longestPalindromStr(String strs) {
		if(strs==null) return null;
		String longest=strs.substring(0, 1);
		for(int i=0;i<strs.length()-1;i++) {
			String palindrom=printSubStr(strs,i,i);
			if(palindrom.length()>longest.length()) {
				longest=palindrom;
			}
		}
		return longest;
		
	}
	public static void main(String[] args) {
	
		String str = "mom madam is coming";
		String longestPalindromStr = Palindrom.longestPalindromStr(str);
		
			System.out.println(longestPalindromStr);
	}

}
