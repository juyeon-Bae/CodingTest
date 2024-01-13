class Solution {
    public int solution(int a, int b) {
        String str1 = String.valueOf(a) + String.valueOf(b); 
        
        int changeNum = Integer.parseInt(str1);  //문자열을 정수로 변환
        int result = 2*a*b; 
            
            if(changeNum>=result){
                return changeNum;
            }
            
        else{
         
            return result;
        }
        
    }
}