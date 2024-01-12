class Solution {
    public int solution(String number) {
       
    int sum =0;
    for(int i=0; i<number.length(); i++){
        char ch = number.charAt(i); //각 인덱스들에 있는 값을 가져옴
       int n = Character.getNumericValue(ch); //위 문자를 정수로 변환
         sum +=n;
    }
        return sum % 9; // 9로 나눈 나머지 반환
    }
}