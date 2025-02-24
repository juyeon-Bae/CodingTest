function solution(s) {
    var answer = ''; 
    let word = s.split(' ') 
    answer = word.map((w)=> w.charAt(0).toUpperCase() + w.slice(1).toLowerCase()).join(' ')
    return answer;
}