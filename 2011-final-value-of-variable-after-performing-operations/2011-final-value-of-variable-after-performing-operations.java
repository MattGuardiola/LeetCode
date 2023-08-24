class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int x = 0;  // Initial value of X
        for (String operation : operations) {
            if (operation.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}