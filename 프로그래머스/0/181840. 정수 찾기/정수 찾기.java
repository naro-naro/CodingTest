class Solution {
    public int solution(int[] num_list, int n) {
        int answer, count = 0;
        for (int i=0; i<num_list.length; i++) {
        	if (num_list[i] == n) {
        		count += 1;
        	}
        }
        if (count >= 1) {
        	answer = 1;
        } else {
        	answer = 0;
        }
        return answer;
    }
}