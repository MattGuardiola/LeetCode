class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Negative numbers and 0 are not powers of two
        }

        // If n is a power of two, it will have exactly one bit set to 1.
        // Using bitwise AND with n-1, if the result is 0, n is a power of two.
        return (n & (n - 1)) == 0;
    }
}