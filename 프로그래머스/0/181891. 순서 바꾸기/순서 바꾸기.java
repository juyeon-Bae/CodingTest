class Solution {
    public int[] solution(int[] num_list, int n) {
         int len = num_list.length;
         int idx =0;
         int[] answer = new int[len];
        for(int i=n; i<len; i++){
            answer[idx]=num_list[i];
            idx++;
        }
        
        for(int j=0; j<n; j++){
            answer[idx]=num_list[j];
            idx++;
        }
        return answer;
    }
}