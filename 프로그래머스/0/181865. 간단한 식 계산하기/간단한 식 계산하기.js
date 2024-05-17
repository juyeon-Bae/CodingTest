function solution(binomial) {
    var [a,op,b] = binomial.split(' ');
    return (op === '+') ? +a + +b : (op === '-') ? a-b : a*b;
        
}