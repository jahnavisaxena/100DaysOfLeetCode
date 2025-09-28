class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int n =nums.length;
        int threshold = n/3;
        
        HashMap<Integer,Integer> freq =new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()>threshold){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
