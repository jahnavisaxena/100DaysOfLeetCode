class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> Freq = new HashMap<>();

        char ch[] = s.toCharArray();
        for(char c : ch) {
            Freq.put(c, Freq.getOrDefault(c,0)+1);
        }
        int maxVowFreq = 0;
        for(Map.Entry<Character,Integer> entry : Freq.entrySet()){
            char c = entry.getKey();
            int f = entry.getValue();
            if(c =='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                maxVowFreq = Math.max(maxVowFreq, f);
            }
        }

        int maxConsFreq = 0;
        
        for(Map.Entry<Character,Integer> entry : Freq.entrySet()){
            char c = entry.getKey();
            int f = entry.getValue();
            if(c !='a' && c != 'e' && c != 'i' && c!='o' && c!='u'){
                maxConsFreq = Math.max(maxConsFreq, f);
            }
        }
        return maxVowFreq + maxConsFreq;

}
}
