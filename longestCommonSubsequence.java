class Solution {

    static int dp[][] =new int[1001][1001];

    public int longestCommonSubsequence(String text1, String text2) {

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(text1,text2,text1.length(),text2.length());
 
    }
    public int helper(String text1,String text2 , int n , int m){

            if(n==0||m==0){
                return 0;
            }
            if(dp[n][m]!=-1){
                return dp[n][m];
            }
            if(text1.charAt(n-1)==text2.charAt(m-1)){
                return dp[n][m] =  helper(text1,text2,n-1,m-1)+1;
            }else{
                return dp[n][m] =  Math.max(helper(text1,text2,n-1,m), helper(text1,text2,n,m-1));
            }
        }
}
