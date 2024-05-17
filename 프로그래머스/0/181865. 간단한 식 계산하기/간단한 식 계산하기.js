function solution(binomial) {
    
    let answer = binomial.split(' ');
    
    let a = parseInt(answer[0]);
    let op = answer[1];
    let b = parseInt(answer[2]);
    
    let result = 0;
    if(op === '+') result = a+b;
    else if(op === '-') result = a-b;
    else if(op === '*') result = a*b;
    
     
    
    return result;
}