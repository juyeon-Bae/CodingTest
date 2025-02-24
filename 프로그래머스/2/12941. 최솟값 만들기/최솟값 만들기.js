function solution(A,B){
    A.sort((a,b) => a-b)
    B.sort((a,b) => b-a)
    return A.reduce((arr,cur,idx) => arr + cur * B[idx], 0);
}