class Solution {
    public int solution(int n) {
        int sum = 0;
        String str = String.valueOf(n);  
        for(int i=0; i<str.length(); i++){
             char ch = str.charAt(i);
            int result = Character.getNumericValue(ch);
            sum +=result;
        }
         
        return sum;
    }
}