class Solution {
    public int solution(String num_str) {
        
        int SIZE = num_str.length();
        int sum =0;
         
        for(int i=0; i<SIZE; i++){
            char str = num_str.charAt(i);
            int change_str = Character.getNumericValue(str);
            sum +=change_str;
        }
        
        return sum;
    }
}