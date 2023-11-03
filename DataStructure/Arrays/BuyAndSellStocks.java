public class BuyAndSellStocks {
   public static int BAS(int prices[]){
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0;i<prices.length;i++){
        if(buyPrice<prices[i]){//We get profit i.e Buying price is less then selling price 
            int profit=prices[i]-buyPrice;//Todays profit
           maxProfit=Math.max(maxProfit, profit);//Overall profit
        }
        else{//we cannot gat profit as buying price is greater than selling /current price so we can buy stocks on that day if minimum buying price 
            buyPrice=prices[i];// we can buy stocks on that day if minimum buying price
          }
    }
    return maxProfit;

   }


    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("The maximum profit is :"+BAS(prices));
     


    }

    /*Day 1
     * We not buyed any stock still now so no buying price no profit
     * 
     */
    /*Day 2
     * Buying Price =7
     * selling price =current price =1
     * Buying Price>selling price so we update the Buying price to current price
     *    Buying price=1
     * 
     */
    /*Day 3
    SP=5
    BP=1
    Profit=5-1=4
     */

       /*Day 4
    SP=3
    BP=1
    Profit=3-1=2
     */

       /*Day 5
    SP=6
    BP=1
    Profit=6-1=5
     */

       /*Day 5
    SP=4
    BP=1
    Profit=4-1=3
     */

       /*The Maximum Profit =5
     */
    
}
