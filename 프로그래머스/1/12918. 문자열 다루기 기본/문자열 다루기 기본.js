function solution(s) {
    let str = s.replace(/[^0-9]/g,'')
    return (str.length === 4 || str.length === 6) && s===str ? true : false;
}