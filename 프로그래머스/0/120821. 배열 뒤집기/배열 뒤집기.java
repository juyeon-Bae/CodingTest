class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int idx = 0;
        int[] answer = new int[len];
        for(int i=len-1; i>=0; i--){
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}