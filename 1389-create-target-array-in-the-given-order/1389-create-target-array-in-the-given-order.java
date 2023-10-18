class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
         int n = nums.length;
    int[] target = new int[n];
    
    for (int i = 0; i < n; i++) {
        int currentIndex = index[i];
        

        for (int j = n - 1; j > currentIndex; j--) {
            target[j] = target[j - 1];
        }
        

        target[currentIndex] = nums[i];
    }
    
    return target;
    }
}