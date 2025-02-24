function solution(my_string) {
    let num2 = ( [...my_string.replace(/[^0-9]/g,'')].sort((a,b)=> a-b))
    return num2.map(Number);
}