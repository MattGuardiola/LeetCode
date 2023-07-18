class Solution {
    public int[] plusOne(int[] digits) {
         int n = digits.length;

        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the current digit is less than 9, increment it by one and return the updated array
                digits[i]++;
                return digits;
            } else {
                // If the current digit is 9, set it to 0 and continue to the next digit
                digits[i] = 0;
            }
        }

        // If all digits were 9, create a new array with an additional leading 1
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}