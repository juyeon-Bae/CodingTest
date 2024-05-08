function solution(a, b) {
    var answer = 0;
    for(var i=a; i<=b; i++) answer += i;
    if(a>b) for(var i=a; i>=b; i--) answer +=i;
    return answer;
}