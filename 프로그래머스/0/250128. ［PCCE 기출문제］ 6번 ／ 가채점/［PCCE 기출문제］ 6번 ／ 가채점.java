class Solution {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) { //numbers가 1부터 시작해서 1을 뺌
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
