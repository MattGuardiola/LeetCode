class Solution {
    public int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        // Find the smallest and largest numbers in the array
        for (int num : nums) {
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }

        // Find and return the GCD of the smallest and largest numbers
        return findGCD(smallest, largest);
    }
    
    
        public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}