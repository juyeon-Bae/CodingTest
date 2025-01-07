function solution(d, budget) {
    var answer = 0;
    d.sort((a,b)=>a-b);
    d.reduce((arr,cur)=>
             {
        if(arr + cur <=budget){
            answer++
            return arr+ cur
        }//if
    } ,0)
    return answer;
}