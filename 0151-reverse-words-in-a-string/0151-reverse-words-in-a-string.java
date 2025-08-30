class Solution {
    public String reverseWords(String s) {
        s=s.trim();
		String[] a= s.split("\\s+");
		int len= a.length ;
		String s2 =a[len-1];
		
		for(int i= len-2 ;i>=0 ;i--) {
			s2=s2+" "+a[i];
		}
		return s2 ;
    }
}