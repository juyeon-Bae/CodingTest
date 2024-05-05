function solution(arr) {
    var answer = arr.reduce((a,b)=> a+b);
    return answer/arr.length;
}