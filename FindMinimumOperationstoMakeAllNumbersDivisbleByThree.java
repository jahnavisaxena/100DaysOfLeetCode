class Solution {
    public int minimumOperations(int[] nums) {
        int ans =0;
        for(int n:nums){
            if(n%3!=0)ans++;
        }
        return ans;
    }
}
