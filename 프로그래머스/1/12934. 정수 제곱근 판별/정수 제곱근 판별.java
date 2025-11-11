class Solution {
    public long solution(long n) {
        long answer = 0;
        long square = (long) Math.sqrt(n);
        
        if (square * square == n) {
            answer = (square + 1) * (square + 1);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}