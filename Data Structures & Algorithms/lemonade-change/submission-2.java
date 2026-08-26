class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            switch (bill) {
                case 5:
                    five++;
                    break;
                case 10:
                    if (five == 0) {
                        return false;
                    }
                    five--;
                    ten++;
                    break;
                case 20:
                    if (five == 0) {
                        return false;
                    }
                    if (ten >= 1) {
                        ten--;
                        five--;
                    } else if (five >= 3) {
                        five -= 3;
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
}

// 각 레몬에이드는 $5
// 각 손님은 차례로 한잔의 레몬에이드를 사고 $5 / $10 / $20 중에 하나를 낸다
// 처음 내가 가진 잔돈은 0원임
// bills[i]는 i번째 손님이 내는 돈
// 손님들에게 모두 올바른 잔돈을 건네줄 수 있으면 true, 아니면 false