class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder acronym = new StringBuilder();
        for (String word : words) {
        if (!word.isEmpty()) { 
            acronym.append(word.charAt(0)); 
        }
    }
    
    return acronym.toString().equals(s);
    }
}