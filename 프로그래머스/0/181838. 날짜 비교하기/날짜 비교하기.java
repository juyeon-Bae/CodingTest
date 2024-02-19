class Solution {
    public int solution(int[] date1, int[] date2) {
       // int answer = 0;
        int len = date1.length;
       for(int i=0; i<len; i++){
           
           if(date1[i]<date2[i]){
              return 1;
           }
           else if(date1[i]>date2[i]){
              return 0;
           }
           
            
           
       }
        return 0;
    }
}