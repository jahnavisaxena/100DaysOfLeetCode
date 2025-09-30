
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(String s, int start, List<String> curr, List<String> res) {
        if (curr.size() == 4 && start == s.length()) {
            res.add(String.join(".", curr));
            return;
        }
        if (curr.size() == 4) return;

        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length()) break;

            String segment = s.substring(start, start + len);

            if (isValid(segment)) {
                curr.add(segment);
                backtrack(s, start + len, curr, res);
                curr.remove(curr.size() - 1); 
            }
        }
    }

    private boolean isValid(String seg) {
        
        if (seg.length() > 1 && seg.charAt(0) == '0') return false;
        int val = Integer.parseInt(seg);
        return val >= 0 && val <= 255;
    }
}

    
