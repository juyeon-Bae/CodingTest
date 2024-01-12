class Solution {
    public int solution(int a, int b) {
        //1. 문자로 계산하기
        //2. 문자로 계산한 값을 정수로 바꾸기
        //3. 정수로 바꾼 값들을 서로 비교해서 큰 값을 return 하기
        
        String num1 = String.valueOf(a) +String.valueOf(b);
        String num2 = String.valueOf(b) +String.valueOf(a);
        
        int num3 = Integer.parseInt(num1); 
        int num4 = Integer.parseInt(num2);
        
        if(num3>=num4){
            return num3;
        }
        else{
            return num4;
        }
    }
}