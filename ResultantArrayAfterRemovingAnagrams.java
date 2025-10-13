import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            if (!stack.isEmpty() && isAnagram(stack.peek(), word)) {
                continue; 
            } else {
                stack.push(word);
            }
        }

        return new ArrayList<>(stack);
    }

    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}
