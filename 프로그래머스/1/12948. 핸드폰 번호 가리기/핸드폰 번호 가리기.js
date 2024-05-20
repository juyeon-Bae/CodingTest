function solution(phone_number) {
    let len = phone_number.length
    let first = phone_number.substr(0,len-4).replace(/./g,'*')
    let last = phone_number.substr(len-4,4)
    return  first+last;
}