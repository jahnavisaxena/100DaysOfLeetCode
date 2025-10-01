class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        int full = numBottles;
        int empty = 0;

        while (full > 0) {
            full--;
            empty++;
            count++;

            if (empty >= numExchange) {
                full++;
                empty -= numExchange;
            }
        }
        return count;
    }
}
