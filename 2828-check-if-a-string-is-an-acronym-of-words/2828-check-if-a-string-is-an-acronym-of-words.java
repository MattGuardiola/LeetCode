class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder acronym = new StringBuilder();
        for (String word : words) {
        if (!word.isEmpty()) { // Check if the word is not empty
            acronym.append(word.charAt(0)); // Append the first character of the word to the acronym
        }
    }
    
    return acronym.toString().equals(s);
    }
}