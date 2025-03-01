function solution(k, m, score) {
    var answer = 0;
    score.sort((a,b) => b - a)
    for(let i=0; i<score.length; i +=m){
        let min = score[i + m -1]
       if(min) answer += min * m
    }
    return answer;
}