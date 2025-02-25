function solution(a, b) {
    const dayList = ["SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"]
    let day = new Date(2016,a-1,b).getDay() 
    return dayList[day];
}