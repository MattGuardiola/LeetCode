class Solution {
    public int lengthOfLastWord(String s) {
             s = s.trim(); 

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                break;
            }
            length++;
        }

        System.out.println("String: " + s);
        System.out.println("Length of last word: " + length);

        return length;
    }
}