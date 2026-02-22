class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];

        int temp = 0 ;
        for(int i=0 ;i<ans.length ;i++){
            if(temp == nums.length){
                temp = 0 ;
            }
            ans[i] = nums[temp++] ; 
        }

        return ans ;
    }
}