function solution(s) {
   var answer = '';
   let arr = s.split(' ').map(Number)
   arr.sort((a,b) => a-b)
   answer += arr[0] + ' '
   answer += arr[arr.length-1]
   return answer;
}