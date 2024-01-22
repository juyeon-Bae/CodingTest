class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String change = myString.replace("A","temp") .replace("B","A") .replace("temp","B");
        if(change.contains(pat)){
            answer = 1;
        }
        else{ answer = 0;
        }
        return answer;
    }
}