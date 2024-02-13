class Solution {
    public int[] solution(int[] arr, int k) {
        int len = arr.length;
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            if(k%2==1){
                answer[i] = k*arr[i];
            }
            else{
                answer[i] = k+arr[i];
            }
        }
        return answer;
    }
}