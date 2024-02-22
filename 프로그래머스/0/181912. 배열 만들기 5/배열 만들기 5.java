import java.util.Arrays;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        return Arrays.stream(intStrs).mapToInt(i -> Integer.parseInt(i.substring(s,s+l)))
            .filter(i-> i>k).toArray();
    }
}