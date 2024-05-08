function solution(a, b) {
    /*  방법1
    var answer = 0;
    var start = Math.min(a,b); 
    var end = Math.max(a,b);
    
    for(var i=start; i<=end; i++) answer +=i; 
    */
    
    // 방법2 (가우스의 합계 공식)
    return (a+b) * (Math.abs(b-a)+1)/2;
}