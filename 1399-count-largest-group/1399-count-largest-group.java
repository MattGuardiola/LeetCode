class Solution {
    public int countLargestGroup(int n) {
         Map<Integer, Integer> groupsFrequency = new HashMap<>();


        for (int i = 1; i <= n; i++) {
            int sumOfDigits = getSumOfDigits(i);
            groupsFrequency.put(sumOfDigits, groupsFrequency.getOrDefault(sumOfDigits, 0) + 1);
        }

        int maxFrequency = 0;
        int count = 0;


        for (int frequency : groupsFrequency.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                count = 1; 
            } else if (frequency == maxFrequency) {
                count++;
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