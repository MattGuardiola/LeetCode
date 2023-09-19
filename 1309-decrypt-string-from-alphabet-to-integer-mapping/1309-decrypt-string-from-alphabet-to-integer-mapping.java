class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < s.length()) {
        if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
            int num = Integer.parseInt(s.substring(i, i + 2));
            char mappedChar = (char) ('a' + num - 1);
            result.append(mappedChar);
            i += 3;
        } else {
            int num = Integer.parseInt(s.substring(i, i + 1));
            char mappedChar = (char) ('a' + num - 1);
            result.append(mappedChar);
            i++;
        }
    }
    return result.toString();
    }
}