 import java.util.Arrays;
public class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
