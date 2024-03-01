class Solution {
    public int solution(int num, int k) {
         
        String arr = String.valueOf(num);
        int idx = arr.indexOf(String.valueOf(k));
        return (arr.contains(String.valueOf(k)))?  idx+1 : -1;
    }
}