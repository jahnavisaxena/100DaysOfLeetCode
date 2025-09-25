class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        // Start from second last row, go upwards
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int below = triangle.get(i+1).get(j);
                int belowRight = triangle.get(i+1).get(j+1);
                int newVal = triangle.get(i).get(j) + Math.min(below, belowRight);
                triangle.get(i).set(j, newVal);
            }
        }
        return triangle.get(0).get(0);
    }
}
