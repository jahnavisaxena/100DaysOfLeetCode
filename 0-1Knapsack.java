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
