class Solution {
    public String sortSentence(String s) {
          // Split the shuffled sentence into words
        String[] words = s.split(" ");

        // Create a mapping from word position to word
        Map<Integer, String> wordMap = new HashMap<>();
        for (String word : words) {
            int index = Integer.parseInt(word.substring(word.length() - 1));
            wordMap.put(index, word.substring(0, word.length() - 1));
        }

        // Reconstruct the original sentence
        StringBuilder originalSentence = new StringBuilder();
        for (int i = 1; i <= words.length; i++) {
            originalSentence.append(wordMap.get(i));
            if (i < words.length) {
                originalSentence.append(" ");
            }
        }

        return originalSentence.toString();
    }
}