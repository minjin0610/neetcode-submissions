class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0; i<stones.length; i++) {
            maxHeap.add(stones[i]);
        }
        
        while (maxHeap.size()>=2) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if (x == y) {
                continue;
            } else {
                maxHeap.offer(x - y);
            }
        }

        if (maxHeap.size()==1) {
            return maxHeap.peek();
        } else {
            return 0;
        }
    }
}
// stones[] : stones[i]는 i번째 돌의 무게를 나타내는 값
// 각 스텝에서 두 개의 가장 무거운 돌을 고름 (x, y) -> 부딪힌다
// if x==y -> 두 돌 모두 파괴
// if x<y -> x는 파괴, y는 새로운 무게를 가짐 (y-x)
// 하나의 돌이 남을때까지 반복
// 마지막에 남은 돌의 무게를 반환, 남은게 없으면 0 반환

// 최대 heap에 다 집어넣고 두 번 poll()해서 두 값 빼기 함
// 뺀 결과가 if x==y면 return, x<y이면 y-x값 다시 offer()
// heap size()<=1 될때까지 반복
// 반복문 종료되면 return