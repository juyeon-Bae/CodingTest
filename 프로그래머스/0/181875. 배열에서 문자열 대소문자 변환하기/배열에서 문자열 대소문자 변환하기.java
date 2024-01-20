class Solution {
    public String[] solution(String[] strArr) {
        int SIZE = strArr.length;
        String[] answer = new String[SIZE];
        for(int i=0; i<SIZE; i++){
            if(i%2==1){
                answer[i] = strArr[i].toUpperCase();
            }
            else{
                answer[i] = strArr[i].toLowerCase();
            }
        }//for
        
        
        return answer;
    }
}