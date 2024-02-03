class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        int multiply = 1;  
        int sum =0;
         for(int i=0; i<len; i++){
             if(len>=11){
             answer = sum +=num_list[i];
             }
             else if(len<=10){
                 answer = multiply *=num_list[i];
             }
         }
        
        return answer;
         
    }
}