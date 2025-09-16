class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for(int i:nums){
            stack.push(i);

            while(stack.size()>1){
                int a =stack.pop();
                int b =stack.pop();
                int g = gcd(a,b);

                if(g>1){
                    long lcm = (long)a / g * b;
                    stack.push((int)lcm);

                }else{
                    stack.push(b);
                    stack.push(a);
                    break;
                }
            }
        }
    return new ArrayList<>(stack);
    }
    private  int gcd(int a,int b){
        while(b!=0){
            int temp =b;
            b =a%b;
            a= temp;
        }
        return a;
    }
}
