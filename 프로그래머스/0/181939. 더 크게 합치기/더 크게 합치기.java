class Solution {
    public int solution(int a, int b) {
        String sa = String.valueOf(a); // a를 문자열로 변환
        String sb = String.valueOf(b); // b를 문자열로 변환

        String ab = sa + sb;
        int iab = Integer.parseInt(ab);
        String ba = sb + sa;
        int iba = Integer.parseInt(ba);
        
        int answer = 0;
        
        if (iab>iba) answer = iab;
        else answer = iba;
        return answer;
    }
}