class Solution {
    public int solution(int order) {
        int answer = 0;
        String orders = String.valueOf(order);
        for(int i=0; i<orders.length(); i++){
            char[] ch = orders.toCharArray();
            if(ch[i]=='3' || ch[i]=='6' || ch[i]=='9'){
                answer++;
            }
        }
        return answer;
    }
}