class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
       
       String[] words = text.split(" ");

       int count = 0;
       for(String word : words){
        boolean canType = true;
        for(char c: brokenLetters.toCharArray()){
         if(word.contains(String.valueOf(c))){
            canType = false;
            break;
         }

       }
       if(canType){
        count++;
       }
       }
       return count;
    }
}
