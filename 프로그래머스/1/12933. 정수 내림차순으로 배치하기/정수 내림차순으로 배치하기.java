import java.util.*;

class Solution {
    public long solution(long n) {
        /**
        * 정수 n을 매개변수로 입력받는다
        * n을 각 자리 수로 나눈다
        * 큰 순서대로 정렬한다
        * 정렬된 숫자를 붙여 출력한다.
        */
        
        List<Integer> list = new ArrayList<>();
        
        while ( n > 0 ) {
            list.add((int)(n % 10));
            n /= 10;
        }
        
        list.sort(Collections.reverseOrder());
        
        long answer = 0;
        
        for (int num : list) {
            answer = answer * 10 + num;
        }
        
        return answer;       
    }
}