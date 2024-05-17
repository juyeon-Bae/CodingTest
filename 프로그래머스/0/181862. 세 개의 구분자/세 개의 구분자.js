function solution(myStr) {
    var answer = myStr.split(/['a'|'b'|'c']/).filter((x)=>x);
    return answer.length === 0 ? ["EMPTY"] : answer;
}