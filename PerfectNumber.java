
class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> fact = new ArrayList<>();
        int sum=0;
        for(int i =1;i < num ; i++){
            if(num % i ==0) fact.add(i);
        }
        for(int f : fact){
            sum+= f;
        }
        if(sum == num){
            return true;
        }
        return false;
    }
}
