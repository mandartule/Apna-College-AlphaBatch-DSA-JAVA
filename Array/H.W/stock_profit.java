
public class stock_profit {

    public static int maxProfit(int price[]) {
        int profit = 0;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < price.length; i++) {

            if (buyPrice < price[i]) {

                profit = price[i]-buyPrice;
                maxProfit = Math.max(profit,maxProfit);

            } else {

                buyPrice = price[i];

            }

        }
    
        return maxProfit;

    }

    public static void main(String args[]) {

        int prices[] = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(prices));
        

    }

}
