// recursion
import java.util.*;

public class Knapsack {
    public static int maxProfit(int weight[], int val[], int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if(weight[n-1]<=W){
            return Math.max(val[n-1]+maxProfit(weight,val,W-weight[n-1],n-1), maxProfit(weight,val,W,n-1));
        }else{
            return maxProfit(weight,val,W,n-1);
        }
}

public static void main(String[] args) {
    int weight[] = {10, 20, 30};
    int val[] = {60, 100, 120};
    int W = 50;
    int n = weight.length;
    System.out.println(maxProfit(weight, val, W, n));
}
}

//memoization
import java.util.*;

public class Knapsack {

    static int dp[][] = new int[102][1002];

    public static int maxProfit(int weight[], int val[], int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (weight[n - 1] <= W) {
            return dp[n][W] = Math.max(val[n - 1] + maxProfit(weight, val, W - weight[n - 1], n - 1), maxProfit(weight, val, W, n - 1));
        } else {
            return dp[n][W] = maxProfit(weight, val, W, n - 1);
        }
    }

public static void main(String[] args) {
    for (int i = 0; i < dp.length; i++) {
        Arrays.fill(dp[i], -1);
    }
    int weight[] = {10, 20, 30};
    int val[] = {60, 100, 120};
    int W = 50;
    int n = weight.length;
    System.out.println(maxProfit(weight, val, W, n));
}
}

