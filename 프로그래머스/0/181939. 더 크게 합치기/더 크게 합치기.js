function solution(a, b) {
    let result1 = ''+a+b;
    let result2 = ''+b+a;
    return Math.max(result1,result2);
}