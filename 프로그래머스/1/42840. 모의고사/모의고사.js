function solution(answers) {
    var answer = [];
    let cnt = [0,0,0]
    
    let first = [1,2,3,4,5]
    let second = [2,1,2,3,2,4,2,5]
    let third = [3,3,1,1,2,2,4,4,5,5]
    
    for(let i=0; i<answers.length; i++){
        if(answers[i] === first[i % first.length]) cnt[0]++ 
        if(answers[i] === second[i % second.length]) cnt[1]++
        if(answers[i] === third[i % third.length]) cnt[2]++
    } 
    let max = Math.max(...cnt)    //cnt : [5,0,0] [2,2,2]
    for(let i=0; i<cnt.length; i++){
        if(cnt[i] === max) answer.push(i+1)
    }
    return answer;
}