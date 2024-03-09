import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        int max1 = numbers[len-1]*numbers[len-2];
        int max2 = numbers[0]*numbers[1];
        return Math.max(max1,max2);
    }
}