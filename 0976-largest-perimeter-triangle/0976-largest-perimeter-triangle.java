class Solution {
    public int largestPerimeter(int[] nums) {
              // Sort the array in descending order
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i]; // Return the largest perimeter
            }
        }
        return 0; // If no valid triangle can be formed
    }
}