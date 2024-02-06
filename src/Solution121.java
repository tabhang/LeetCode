public class Solution121 {

    // O(n^2) time limit exceed
//    public static int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            int buy = prices[i];
//            for (int j = i + 1; j <= prices.length - 1; j++) {
//                int sell = prices[j];
//                if (sell < buy)
//                    continue;
//                int p = sell - buy;
//                if (p > maxProfit)
//                    maxProfit = p;
//            }
//        }
//        return maxProfit;
//    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0, left = 0, right = 1;
        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                int profit = prices[right] - prices[left];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {

//        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {3, 2, 6, 5, 0, 3};
//        int[] prices = { 1, 2};
//        int[] prices = {2, 1, 2, 1, 0, 1, 2};
        int[] prices = {2, 4, 1, 11, 7};

        System.out.println(maxProfit(prices));
    }
}
