class Solution {
    public int solution(String my_string) {
        int sum = 0;
        String str = my_string.replaceAll("[a-zA-Z]","");
        for(int i=0; i<str.length(); i++){
            
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
}