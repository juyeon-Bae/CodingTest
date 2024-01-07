class Solution {
    public String solution(String my_string, int k) {
       String answer ="";
        for(int i=0; i<k; i++){ //k번만큼 문자열을 반복시킴
            answer +=my_string;
        }
        return answer;
    }
}