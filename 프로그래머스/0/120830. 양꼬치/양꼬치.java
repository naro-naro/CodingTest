class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int count = 0;
        for (int i=1; i<=n; i++){
            answer += 12000;
            if (i%10 == 0){
                count++;
            }
        }
        for (int i=1; i<=k; i++){
            answer += 2000;
        }
        answer -= count*2000;
        return answer;
    }
}