class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double s = 0;
        
        for (int i=0; i<arr.length; i++)
            s += arr[i];
        
        answer = s / arr.length;
        
        return answer;
    }
}