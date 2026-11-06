class Solution {
    public int[] finalPrices(int[] prices) {

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                } else {
                    continue;
                }
            }
        }

        return prices;
    }
}
// prices[i]보다 작거나 같은 값이 있으면 현재 값에서 그 값만큼 할인
// 할인된 최종 가격을 return 
