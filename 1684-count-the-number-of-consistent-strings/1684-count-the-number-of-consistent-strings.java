class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
           int count = 0;
        boolean[] allowedChars = new boolean[26]; // Assuming lowercase English alphabet

        // Mark characters in 'allowed' as allowed
        for (char c : allowed.toCharArray()) {
            allowedChars[c - 'a'] = true;
        }

        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedChars[c - 'a']) {
                    isConsistent = false;
                    break; // If a character is not allowed, the word is not consistent
                }
            }
            if (isConsistent) {
                count++;
            }
        }

        return count;
        
    }
}