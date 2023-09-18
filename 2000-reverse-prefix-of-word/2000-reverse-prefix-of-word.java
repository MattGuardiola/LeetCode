class Solution {
    public String reversePrefix(String word, char ch) {
        // Find the index of the first occurrence of ch in the word
        int index = word.indexOf(ch);

        // If ch is not found, return the original word
        if (index == -1) {
            return word;
        }

        // Create a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Reverse the substring from 0 to the index of ch
        for (int i = index; i >= 0; i--) {
            result.append(word.charAt(i));
        }

        // Append the remaining part of the word
        for (int i = index + 1; i < word.length(); i++) {
            result.append(word.charAt(i));
        }

        return result.toString();
    }
}