function solution(s){
    var answer = true;
    let word = s.toLowerCase();
    return word.split('p').length === word.split('y').length;
}