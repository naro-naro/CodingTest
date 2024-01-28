class Solution {
    public int solution(int a, int b) {
        String sa = String.valueOf(a); // a를 문자열로 변환
        String sb = String.valueOf(b); // b를 문자열로 변환
        String sab = sa+sb; // 문자열a + 문자열b
        int ab = Integer.parseInt(sab); // 문자열 sab를 정수로 변환
        int ab2 = a*b*2;
        int answer = 0;
        if (ab>ab2) answer = ab;
        else answer = ab2;

        return answer;
    }
}