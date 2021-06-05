package PracticeAlgorithm;

public class BuyAndSellStock {
  public static int maxProfit(int[] prices) {
    int maxProfit = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        int profit = prices[j] - prices[i] < 0 ? 0 : prices[j] - prices[i];
        if(profit > maxProfit) {
          maxProfit = profit;
        }
      }
    }
    return  maxProfit;
  }

  public static int maxProfit2(int[] prices) {
    int max = 0;
    int min = Integer.MAX_VALUE;
    for ( int i = 0 ; i < prices.length; i++) {
      if(prices[i] < min) {
        min = prices[i];
      } else {
        max = Math.max(max,prices[i] - min);
      }
    }

    return max;
  }

  public static void main(String[] args) {
    int[] arr = {7,1,5,3,6,4,1};
    System.out.println(maxProfit2(arr));
  }
}
