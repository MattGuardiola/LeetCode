class Solution {
    public boolean checkIfPangram(String sentence) {
       // Create a boolean array to mark the presence of each alphabet letter
        boolean[] alphabetPresent = new boolean[26];

        // Convert the sentence to lowercase to make it case-insensitive
        sentence = sentence.toLowerCase();

        // Iterate through the characters of the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            // Check if the current character is a lowercase letter
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Mark the presence of this letter in the array
                alphabetPresent[currentChar - 'a'] = true;
            }
        }

        // Check if all alphabet letters have been marked as present
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true; 
    }
}