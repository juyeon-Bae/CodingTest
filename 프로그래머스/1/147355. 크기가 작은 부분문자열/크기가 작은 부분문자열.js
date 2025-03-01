function solution(t, p) {
    var answer = 0;
    let num = [];
    const partLen = p.length;

    for (let i = 0; i < t.length; i++) {   
        let partStr = t.substr(i, partLen);
        if (partStr.length === partLen) {   
          num.push(partStr)
           
        num = num.map(x => Number(x))
        if(num[i] <= Number(p))answer++
        }
    }
 
        return answer
}
