class Solution {
    public String truncateSentence(String s, int k) {
         // Split the sentence into words
    String[] words = s.split(" ");

    // Ensure k is not greater than the number of words
    k = Math.min(k, words.length);

    // Select the first k words and join them back into a sentence
    StringBuilder truncatedSentence = new StringBuilder();
    for (int i = 0; i < k; i++) {
        truncatedSentence.append(words[i]);
        if (i < k - 1) {
            truncatedSentence.append(" "); // Add space between words
        }
    }

    return truncatedSentence.toString();
    }
}