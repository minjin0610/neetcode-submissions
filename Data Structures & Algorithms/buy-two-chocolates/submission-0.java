class Solution {
    public int buyChoco(int[] prices, int money) {
        
        Arrays.sort(prices);
        int deposit = money - (prices[0] + prices[1]);

        if (deposit >= 0) {
            return deposit;
        } else {
            return money;
        } 
    }
}
// prices[i] 값은 초콜릿 가격
// money도 주어짐 (초기 보유한 돈)
// 두 개의 초콜릿 구매해야하는데, 이때 최소의 값으로 사야함, 단, 남은 돈이 양수
// 두 개의 초콜릿을 구매하고 남은 잔돈의 값을 구하여라
// 만약 답이 없다면 주어진 돈을 반환하라
