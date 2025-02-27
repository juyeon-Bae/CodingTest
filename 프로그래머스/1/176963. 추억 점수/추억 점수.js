function solution(name, yearning, photo) {
    var answer = [];
    
        for(let i=0; i<photo.length; i++){
            let filtered = photo[i].filter(x => name.includes(x))
            //console.log(filtered)
            let cnt = 0
            
            for(let j=0; j<filtered.length; j++){
               let index = name.indexOf(filtered[j])
              // console.log(index)
                cnt += yearning[index]
           }
          answer.push(cnt)
        }
     
    return answer;
}