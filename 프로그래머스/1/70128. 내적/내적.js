function solution(a, b) {
    return a.reduce((arr,cur,idx)=> arr+=a[idx]*b[idx],0);
}