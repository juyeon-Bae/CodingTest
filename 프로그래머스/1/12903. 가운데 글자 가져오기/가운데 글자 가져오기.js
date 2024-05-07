function solution(s) {
    var answer = '';
    for(x of s){
        if(s.length%2==1) answer = s.charAt(s.length/2);
        else answer = s.charAt(s.length/2-1) + s.charAt(s.length/2); 
    }
    return answer;
}