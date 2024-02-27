import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            answer = array[array.length/2];
        }
        return answer;
    }
}