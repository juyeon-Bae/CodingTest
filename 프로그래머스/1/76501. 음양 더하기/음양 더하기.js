function solution(absolutes, signs) {
    var answer = 123456789;
    var sum = 0
    for(let i = 0 ; i<signs.length; i++){
        if(signs[i] === true){
            absolutes[i] +=0
        }
        else{
            absolutes[i] = absolutes[i] - (absolutes[i] *2)
        }
        sum +=absolutes[i]
       
    }
    return sum;
}