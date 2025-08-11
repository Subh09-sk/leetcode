import java.util.Arrays ;
class Solution {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1 ;
        int maxcount=1 ;
        int maxvalue=nums[0];
        for(int i=1 ;i< nums.length ;i++){
            if(nums[i]==nums[i-1]) count++ ;
            else count=1 ;

            if(count>maxcount){
                maxcount=count ;
                maxvalue=nums[i];
            }
        }   
        return maxvalue ;
    }
    public static void main(String args[]){
        int[] nums ={3,2,3};
        System.out.println(majorityElement(nums));
    }
}