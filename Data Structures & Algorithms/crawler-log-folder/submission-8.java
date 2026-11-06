class Solution {
    public int minOperations(String[] logs) {
        
        Stack<String> stack = new Stack<>();

        for (String log : logs) {
            if (log.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (log.equals("./")) {
                continue;
            } else {
                stack.push(log);
            }
        }
        System.out.println(stack);
        return stack.size();
    }
}

// ../ : 현재 폴더의 부모 폴더로 이동 (현재 메인 폴더에 있는 경우 같은 폴더에 머무름)
// ./ : 같은 폴더에 머무름
// x/ : x라는 이름의 자식 폴더로 이동 (이 폴더는 항상 존재하는 것이 보장됨)
// 메인 폴더로 돌아가기 위한 최소 조작 횟수를 return










