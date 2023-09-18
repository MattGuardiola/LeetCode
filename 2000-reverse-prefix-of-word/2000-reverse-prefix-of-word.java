class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        StringBuilder result = new StringBuilder();


        for (int i = index; i >= 0; i--) {
            result.append(word.charAt(i));
        }

        for (int i = index + 1; i < word.length(); i++) {
            result.append(word.charAt(i));
        }

        return result.toString();
    }
}