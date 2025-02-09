function solution(food) {
    var answer = '';
    let array = [];
    
    for(let i=1; i<food.length; i++){
        let foodCount = Math.floor(food[i]/2) //1, 2, 3   3,0,1 
        array.push(...Array(foodCount).fill(i))
    }
    
    return array.join('') + '0' + array.reverse().join('');
}