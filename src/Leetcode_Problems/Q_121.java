package Leetcode_Problems;

public class Q_121 {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        int [] arr2 = {3,2,6,5,0,3};
        System.out.println(maxProfit(arr));

    }

    static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}