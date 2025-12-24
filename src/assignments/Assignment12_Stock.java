package assignments;

public class Assignment12_Stock {

	public static void main(String[] args) {
		
		        // Example 1
		        int[] prices1 = {7, 1, 5, 3, 6, 4};
		        Solution sol = new Solution();
		        System.out.println("Max Profit (Example 1): " + sol.maxProfit(prices1));

		        // Example 2
		        int[] prices2 = {7, 6, 4, 3, 1};
		        System.out.println("Max Profit (Example 2): " + sol.maxProfit(prices2));
		    }
		}

		class Solution {
		    public int maxProfit(int[] prices) {
		        int minPrice = prices[0];   // start with first day's price
		        int maxProfit = 0;

		        for (int i = 1; i < prices.length; i++) {
		            if (prices[i] < minPrice) {
		                minPrice = prices[i];
		            } else if (prices[i] - minPrice > maxProfit) {
		                maxProfit = prices[i] - minPrice;
		            }
		        }

		        return maxProfit;
		    }
		}

