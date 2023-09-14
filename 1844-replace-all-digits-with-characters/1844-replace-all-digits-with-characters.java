class Solution {
    public String replaceDigits(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                // Even index, just append the character as is
                result.append(s.charAt(i));
            } else {
                // Odd index, shift the character and append
                char prevChar = s.charAt(i - 1);
                char shiftedChar = shift(prevChar, Character.getNumericValue(s.charAt(i)));
                result.append(shiftedChar);
            }
        }
        
        return result.toString();
    }
    
     private char shift(char c, int x) {
        return (char)(c + x);
    }
}