package Array.BestTimeToBuyandSell;



public class BestTimeToBuyandSell2 {
    
    public static int maxProfit(int[] prices){
        if(prices.length == 1) return 0;
        int profit = 0;
        int left = 0;
        for(int right = 1; right <prices.length;right++){
            if(prices[right]>prices[left]){
                if(profit < prices[right]-prices[left]){
                    profit = prices[right]-prices[left];
                }
            }
            else{
                left = right;
            }
        }
        return profit;
    }
    
    public static void main(String[] args) {
        int nums[] = { 7, 1, 5, 3, 6, 4 };
        int profit = maxProfit(nums);
        System.out.println((profit));

        int nums2[] = { 7, 6, 3, 1 };
        profit = maxProfit(nums2);

        System.out.println((profit));

        int nums3[] = { 7 };
        profit = maxProfit(nums3);
        System.out.println((profit));

    }
}
