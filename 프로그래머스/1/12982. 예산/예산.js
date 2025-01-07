function solution(d, budget) {
    let answer = 0;
    let save = 0;
    d.sort((a,b)=>a-b)
    for(let i=0; i<d.length; i++){
        save += d[i];
        if(save <= budget) answer++
    }
    return answer;
}