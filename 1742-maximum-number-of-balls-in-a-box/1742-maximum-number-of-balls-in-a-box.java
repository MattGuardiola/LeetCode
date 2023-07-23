class Solution {
    public int countBalls(int lowLimit, int highLimit) {
          HashMap<Integer, Integer> boxCounts = new HashMap<>();
        int maxBoxCount = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int sumOfDigits = calculateSumOfDigits(i);
            boxCounts.put(sumOfDigits, boxCounts.getOrDefault(sumOfDigits, 0) + 1);
            maxBoxCount = Math.max(maxBoxCount, boxCounts.get(sumOfDigits));
        }

        return maxBoxCount;
    }
    
     private static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    
}