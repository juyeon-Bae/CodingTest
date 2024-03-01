class Solution {
    public int[] solution(int n) {
        int plus = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                plus++;
            }
        }
        int[]  answer = new int[plus];
        int a =0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[a++]=i;
            }
        }
        return answer;
    }
}