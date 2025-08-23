class Solution {
    public int compress(char[] chars) {
        int i=0 ;
        int j=0 ;
        while(j<chars.length){
            char curr  =chars[j];
            int count=0;
            while(j<chars.length && curr == chars[j]){
                count++ ;
                j++ ;
            }
            chars[i++]= curr ;

            if(count>1){
                for(char a : String.valueOf(count).toCharArray()){
                    chars[i++] = a;
                }
            }
        }
        return i ;
    }
}