import java.util.Arrays;
class Solution {
    public String solution(String[] str_list, String ex) {
     return Arrays.stream(str_list).filter(i -> !i.contains(ex))
         .reduce("",(acc,i)->(acc+i)); //acc : 누적변수
    }
}