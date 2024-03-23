import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String answer = "";
        String[] str = String.valueOf(n).split(""); 
        Arrays.sort(str);
        for(int i=str.length-1; i>=0; i--){
            answer +=str[i];
        }
        return  Long.parseLong(answer);  

    }
}