class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int square, multiply = 1;
        
        for(int i=0; i<num_list.length; i++){
            multiply *=num_list[i]; //원소들의 곱
            sum +=num_list[i]; //모든 원소들의 합
            square = (sum*sum); //합의 제곱
            if(multiply<square){
                answer =1;
            }
            else{
                answer =0;
            }
        }
        return answer;
    }
}