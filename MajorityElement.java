class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length ;
        int threshold = n/2;
        int max =0;
        
        HashMap<Integer,Integer> freq =new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()> threshold){
                max = entry.getKey();
            }
        }
        return max;
    }
}
