class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int right = str.length-1;
        int left = 0;
        while(left<right){
            String temp = str[left];
            str[left] =str[right];
            str[right] =temp;

            left++;
            right--;
        }
        return String.join(" ",str);
    }
}
