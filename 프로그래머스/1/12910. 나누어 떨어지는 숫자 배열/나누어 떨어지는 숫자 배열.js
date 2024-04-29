function solution(arr, divisor) {
    var answer = arr.filter(i => i % divisor == 0);
    return answer.length < 1 ? [-1] : answer.sort((a,b)=>a-b);
}