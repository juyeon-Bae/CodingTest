function solution(s){
    var p = 0; var y = 0;
    var str = s.toLowerCase();
    
    for(x of str){
        if(x === "p") p++;
        if(x === "y") y++;
    }
    
    return (p++ === y++) ? true : false;
}