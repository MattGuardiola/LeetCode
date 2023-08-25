class Solution {
    public int mostWordsFound(String[] sentences) {
          int maxWords = 0;
        
        for (String sentence : sentences) {
            // Split the sentence into words using space as a delimiter
            String[] words = sentence.split(" ");
            
            // Count the number of words in the current sentence
            int wordCount = words.length;
            
            // Update maxWords if the current sentence has more words
            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }
        
        return maxWords;
    
    }
}