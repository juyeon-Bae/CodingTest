class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int result1 =a+b+c;
        int result2 = result1 * (a*a + b*b + c*c);
        int result3 = result2 * (a*a*a + b*b*b + c*c*c);
        
         if(a!=b && a!=c && b!=c){
             answer = result1;
         }
        else if( a==b && b!=c || b==c && c!=a || c==a && a!=b) {
            answer = result2;
        }
        
             
         else {
                 answer = result3;
             }
        
        return answer;
    }
}