class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int[] daysInMonth = {
            0, 
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int dayOfYear = 0;

        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }

        if (isLeapYear && month > 2) {
            dayOfYear += 1; 
        }

        dayOfYear += day;

        return dayOfYear;
    }
}