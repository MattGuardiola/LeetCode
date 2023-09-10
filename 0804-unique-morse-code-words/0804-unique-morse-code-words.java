class Solution {
    public int uniqueMorseRepresentations(String[] words) {
          // Define the Morse code mapping for each character.
        String[] morseCodes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        Set<String> uniqueTransformations = new HashSet<>();
        
        for (String word : words) {
            StringBuilder transformation = new StringBuilder();
            for (char c : word.toCharArray()) {
                transformation.append(morseCodes[c - 'a']);
            }
            uniqueTransformations.add(transformation.toString());
        }
        
        return uniqueTransformations.size();
        
    }
}