class Solution {
    public int mySqrt(int x) {
          if (x == 0 || x == 1) {
            return x;
        }
        
        long left = 1; // Use long to avoid integer overflow during calculations
        long right = x / 2;
        long result = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            
            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
                result = mid; // Keep track of the latest valid result
            } else {
                right = mid - 1;
            }
        }
        
        return (int) result;
    }
}