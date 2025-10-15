class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int sum =0;
        for(int i :nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(freq % k ==0){
                sum += num*freq;
            }
        }

        
        return sum;
        
    }
}
