class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            int cnt = 0;
            for (int j = i + 1; j < len; j++) {
                if (prices[i] <= prices[j]) {
                    cnt++;
                } else{
                    cnt++;
                    break;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}