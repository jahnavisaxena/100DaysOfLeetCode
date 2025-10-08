import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            
            long minPotion = (success + spell - 1) / spell; // ceiling division
            
            int index = lowerBound(potions, minPotion);
            
            pairs[i] = m - index;
        }
        
        return pairs;
    }

    private int lowerBound(int[] potions, long target) {
        int low = 0, high = potions.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (potions[mid] < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
