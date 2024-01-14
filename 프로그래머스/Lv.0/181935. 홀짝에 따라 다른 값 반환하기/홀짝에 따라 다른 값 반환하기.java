class Solution {
    public int solution(int n) {
        int sum =0;
        for(int i=1; i<=n; i++){
            if(n%2==1 && i%2 ==1){
                sum +=i;
            }//if
            else if(n%2 == 0 && i%2 ==0){
                sum +=i*i;
            }
            
        }//for
      
         return sum;
       
       
    }
}