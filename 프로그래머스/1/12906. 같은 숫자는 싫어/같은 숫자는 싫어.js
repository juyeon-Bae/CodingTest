function solution(arr)
{
    return arr.filter((x,idx) => x  != arr[idx+1]);
}