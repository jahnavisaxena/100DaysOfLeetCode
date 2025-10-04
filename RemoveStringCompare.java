class Solution {
    public boolean backspaceCompare(String s, String t) {
            return compare(s).equals(compare(t));
        }

        private String compare(String str){
            StringBuilder sb = new StringBuilder();

            for(char c : str.toCharArray()){
                if(c == '#'){
                    if(sb.length()>0){
                        sb.deleteCharAt(sb.length()-1);
                    }
                }else{
                    sb.append(c);
                }
            }
            return sb.toString();

        }
    }
