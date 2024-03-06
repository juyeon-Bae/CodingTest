import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int len = sides.length;
        for(int i=0; i<len-1; i++){
            answer +=sides[i];
        }
        
        return answer>sides[len-1]? 1:2;
    }
}