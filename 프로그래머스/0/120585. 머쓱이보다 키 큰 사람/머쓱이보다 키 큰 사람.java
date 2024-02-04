import java.util.Arrays;
class Solution {
    public int solution(int[] array, int height) {
        return (int)Arrays.stream(array).filter(x -> x>height).count();
        //count()는 long타입을 반환함으로 (int)로 형변환을 해주어야 된다.
    }
}