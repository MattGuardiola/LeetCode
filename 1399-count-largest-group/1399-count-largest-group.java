class Solution {
    public int countLargestGroup(int n) {
         Map<Integer, Integer> groupsFrequency = new HashMap<>();

        // Calculate the sum of digits for each number and group them accordingly
        for (int i = 1; i <= n; i++) {
            int sumOfDigits = getSumOfDigits(i);
            groupsFrequency.put(sumOfDigits, groupsFrequency.getOrDefault(sumOfDigits, 0) + 1);
        }

        int maxFrequency = 0;
        int count = 0;

        // Find the maximum frequency
        for (int frequency : groupsFrequency.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                count = 1; // Reset the count when a higher frequency is found
            } else if (frequency == maxFrequency) {
                count++; // Increment the count when another group has the same maximum frequency
            }
        }
        
        return count;
    }
    
    
    public static int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}