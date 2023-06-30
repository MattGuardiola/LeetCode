class Solution {
    public int smallestEvenMultiple(int n) {
      while (n % 2 != 0){
           int x = 2;
          int y = n * x;
        return y;
      }
        return n;
    }
}