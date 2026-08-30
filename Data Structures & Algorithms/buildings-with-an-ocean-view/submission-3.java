class Solution {
    public int[] findBuildings(int[] heights) {
        
        int l = heights.length - 1;
        List<Integer> list = new ArrayList<>();
        int maxHeight = 0;

        for (int i = l; i >= 0; i--) {
            if (heights[i] > maxHeight) {
                list.add(i);
            }
            maxHeight = Math.max(maxHeight, heights[i]);
        }
        
        Collections.reverse(list);
        int[] answer  = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}

// heights[i]는 i번째 빌딩의 높이
// 오른쪽 멀리에 해변이 위치해있음
// 오른쪽에 있는 모든 빌딩의 높이가 낮으면 해당 빌딩은 오션뷰이다
// 오션뷰를 가진 빌딩의 인덱스 번호를 오름차순으로 정렬해서 반환하라

// 배열 오른쪽에서 왼쪽으로 오면서 빌딩 높이 최대값을 저장해두고 비교하면 될듯