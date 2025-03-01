function solution(k, m, score) {
    var answer = 0;
     let arr = []
     
    score.sort((a,b)=> b - a)
      
    for(let i=0; i<score.length; i +=m){
         let group = score.slice(i,i+m)
          if(group.length === m) {
              arr.push(group)
          }
    }
    console.log(arr)
    
    answer = arr.reduce((acc, cur)=>{
        let min = Math.min(...cur)
        return acc + min * m
    },0)
    return answer
}

  
 
 