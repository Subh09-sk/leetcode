class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();

        for(Integer n : nums){
            map.put(n , map.getOrDefault(n , 0)+1) ;
        }

        Map<Integer, Integer> freqMap = new HashMap<>() ;
        for(int m : map.values()){
            freqMap.put(m , freqMap.getOrDefault(m , 0)+1);
        }

        for(int num : nums){
            int freq = map.get(num) ;
            if(freqMap.get(freq)==1){
                return num ;
            }
        }
        return -1 ;
    }
}