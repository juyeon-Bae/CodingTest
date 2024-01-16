class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n]; //배열 크기 생성
  
        for(int i=0; i<n; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}