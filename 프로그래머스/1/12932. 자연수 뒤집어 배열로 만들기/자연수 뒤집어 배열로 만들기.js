function solution(n) {
    return (n+'').split('').reverse().map(x => parseInt(x));
}