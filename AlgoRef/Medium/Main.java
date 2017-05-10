import java.util.*;

public class Main {

    /**
     * Created by ggaddam on 8/21/2016.
     */

        private static int maxProfit(int[] prices) {
            if(prices == null || prices.length == 0) return 0;

            int min = prices[0], profit = 0;
            for(int i = 0; i < prices.length; i ++) {
                if(prices[i] < min) {
                    min = prices[i];
                }else {
                    if(prices[i] - min > profit) profit = prices[i] - min;
                }
            }

            return profit;
        }

        public static void main(String args[]){
            int nums[] = {5,7,3,2,1};
            maxProfit(nums);
        }
    }



