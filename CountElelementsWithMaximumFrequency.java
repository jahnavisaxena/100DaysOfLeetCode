class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int maxfreq = 0;
        for(int count : freq.values()){
            maxfreq = Math.max(maxfreq,count);
        }
     int total = 0;
      for(int count: freq.values()){
        if(count == maxfreq){
          total+=count;
        }
      }
      return total;
    }
}
