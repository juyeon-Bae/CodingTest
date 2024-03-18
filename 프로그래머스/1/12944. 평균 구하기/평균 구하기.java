class Solution {
    public double solution(int[] arr) {
        int sum =0;
        int len = arr.length;
        for(int i=0; i<len; i++){
            sum +=arr[i];
        }
        
        return (double)sum/len;
    }
}