class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double s = 0;
        
        for(int i=0; i<numbers.length; i++){
            s += numbers[i];
        }
        
        answer = s/numbers.length;
        return answer;
    }
}