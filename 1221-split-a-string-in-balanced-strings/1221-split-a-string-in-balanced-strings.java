class Solution {
    public int balancedStringSplit(String s) {
                int balancedCount = 0;
        int lCount = 0;
        int rCount = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                lCount++;
            } else if (c == 'R') {
                rCount++;
            }

            if (lCount == rCount) {
                balancedCount++;
                lCount = 0;
                rCount = 0;
            }
        }

        return balancedCount;
    }
}