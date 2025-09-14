class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>(Arrays.asList(wordlist)); //exact match

        HashMap<String,String> caseMap= new HashMap<>();

        HashMap<String , String> vowelMap = new HashMap<>();
        for(String word:wordlist){
            caseMap.putIfAbsent(word.toLowerCase(),word);

            String devowel = devowel(word.toLowerCase());
            vowelMap.putIfAbsent(devowel,word);
        }

         String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            
            if (exactWords.contains(query)) {
                result[i] = query; // exact match
            } else {
                String lower = query.toLowerCase();
                if (caseMap.containsKey(lower)) {
                    result[i] = caseMap.get(lower); // case-insensitive match
                } else {
                    String devowel = devowel(lower);
                    result[i] = vowelMap.getOrDefault(devowel, ""); // vowel match or ""
                }
            }
    }
    return result;
}
  private String devowel(String s){
        return s.replaceAll("[aeiou]","*");
    }
}
