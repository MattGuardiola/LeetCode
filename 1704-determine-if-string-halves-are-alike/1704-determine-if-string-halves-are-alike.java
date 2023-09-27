class Solution {
    public boolean halvesAreAlike(String s) {
         // Create a set of vowels for easy checking
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        // Calculate the length of the string and split it into two halves
        int length = s.length();
        String a = s.substring(0, length / 2);
        String b = s.substring(length / 2);

        // Count the number of vowels in both halves
        int countA = countVowels(a, vowels);
        int countB = countVowels(b, vowels);

        // Check if the counts of vowels in both halves are equal
        return countA == countB;
    }
    
    public static int countVowels(String s, Set<Character> vowels) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }
}