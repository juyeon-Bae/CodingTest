class Solution {
    public int solution(int[] num_list) {
       
        String sum1 ="";
        String sum2 ="";
         
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){ //짝수
                sum1 +=String.valueOf(num_list[i]);
            }
            else { //홀수
                 sum2 +=String.valueOf(num_list[i]);
            }
            
        }
        int answer = Integer.parseInt(sum1)+Integer.parseInt(sum2);
        return answer;
    }
}