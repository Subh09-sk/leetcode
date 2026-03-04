class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> list = new ArrayList<>() ;
        int max = Integer.MIN_VALUE ;
        for(int n : candies){
            if(max < n){
                max = n ;
            }
        }

        for(int n : candies){
            if((n+extraCandies) >= max ){
                list.add(true) ;
            }
            else{
                list.add(false) ;
            }
        }
        return list ;
    }
}