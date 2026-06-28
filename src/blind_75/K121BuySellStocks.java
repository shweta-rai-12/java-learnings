package blind_75;

public class K121BuySellStocks {

    /**
     * Problem - Given a array with prices, you need to chose a price to buy and a price to sell,
     * such that the profit is maximized. You can only buy and sell once.
     * @param prices = array of stock prices
     * @return - Max profit after selling the stock which you buy
     */
    public static int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for(int price : prices) {
            minValue = Math.min(minValue, price);
            maxProfit = Math.max(maxProfit, price - minValue);
        }
        return maxProfit;
    }


    public static void main(String[] args){
        int[] prices = {7,1,5,3,1,4};
        System.out.println("The maximum profit that can be achieved is: " + maxProfit(prices));
    }
}
