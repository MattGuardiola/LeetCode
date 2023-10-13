class Solution {
    public int countPairs(List<Integer> nums, int target) {
 Collections.sort(nums); // Sort the list in ascending order.
    int count = 0;
    int left = 0;
    int right = nums.size() - 1;

    while (left < right) {
        if (nums.get(left) + nums.get(right) < target) {
            // If the sum is less than the target, then all pairs with nums.get(left) as the first element will also satisfy the condition.
            count += (right - left);
            left++;
        } else {
            // If the sum is greater than or equal to the target, move the right pointer to the left.
            right--;
        }
    }

    return count;
    }
}