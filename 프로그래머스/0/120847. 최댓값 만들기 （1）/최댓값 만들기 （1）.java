import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = 1;
        int len = numbers.length;
        for(int i=len-2; i<len; i++){
            answer *=numbers[i];
        }
        return answer;
    }
}