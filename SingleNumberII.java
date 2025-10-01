class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry : freq.entrySet()){
            if(entry.getValue() == 1){
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
