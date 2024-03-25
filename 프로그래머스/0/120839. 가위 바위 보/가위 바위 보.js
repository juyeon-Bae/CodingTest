function solution(rsp) {
    return rsp.split('').map((i)=> (i==='2')?'0': (i==='0')?'5':'2').join('');
}