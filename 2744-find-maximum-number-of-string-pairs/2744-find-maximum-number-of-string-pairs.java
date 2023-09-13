class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
          int maxPairs = 0;
    Map<String, Integer> reversedCount = new HashMap<>();

    for (String word : words) {
        String reversed = reverseString(word);
        int count = reversedCount.getOrDefault(reversed, 0);
        maxPairs += count;
        reversedCount.put(word, count + 1);
    }

    return maxPairs;
    }
    
    private String reverseString(String s) {
    char[] chars = s.toCharArray();
    int left = 0, right = s.length() - 1;

    while (left < right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
    }

    return new String(chars);
    }
}