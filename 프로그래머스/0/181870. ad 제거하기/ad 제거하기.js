function solution(strArr) {
    var answer = [];
    for(x of strArr)
    if(!x.includes("ad")) answer.push(x)
    return answer;
}