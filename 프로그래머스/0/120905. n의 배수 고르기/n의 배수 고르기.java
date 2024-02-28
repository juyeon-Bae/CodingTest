import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        return Arrays.stream(numlist).filter(i -> i%n==0).toArray();
    }
}