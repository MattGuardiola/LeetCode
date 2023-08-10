class Solution {
    public int pivotInteger(int n) {
         int totalSum = n * (n + 1) / 2; // Calculate the sum of all elements from 1 to n
        
        int leftSum = 0;
        for (int x = 1; x <= n; x++) {
            int rightSum = totalSum - leftSum - x;
            if (leftSum == rightSum) {
                return x; // Found the pivot integer
            }
            leftSum += x;
        }
        
        return -1; // No pivot integer found
    }
}