function solution(n)
{
    return (n+'').split('').reduce((a,b)=>parseInt(a)+parseInt(b),0);
}