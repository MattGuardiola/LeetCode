class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         int totalBottles = numBottles; // Initialize totalBottles with the given numBottles
        int drankBottles = numBottles; // Initialize drankBottles with the given numBottles

        // Continue exchanging empty bottles for full bottles until it's no longer possible
        while (totalBottles >= numExchange) {
            int exchangedBottles = totalBottles / numExchange; // Calculate how many bottles you can exchange
            drankBottles += exchangedBottles; // Add the exchanged bottles to the total drank bottles
            totalBottles = exchangedBottles + (totalBottles % numExchange); // Calculate the remaining bottles after exchange
        }

        return drankBottles;
    }
}