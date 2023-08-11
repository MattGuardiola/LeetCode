class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int initialBalance = 100;
        
        // Calculate the rounded amount
        int roundedAmount = (purchaseAmount + 5) / 10 * 10;

        // Calculate the new account balance after the purchase
        int newBalance = initialBalance - roundedAmount;

        return newBalance;
    }
}