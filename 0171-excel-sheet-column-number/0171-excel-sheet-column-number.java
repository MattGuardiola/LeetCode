class Solution {
    public int titleToNumber(String columnTitle) {
           int result = 0;
        int n = columnTitle.length();
        
        for (int i = 0; i < n; i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1; // Convert the character to a numerical value (1 to 26)
            result = result * 26 + value; // Update the column number
        }
        
        return result;
    }
}