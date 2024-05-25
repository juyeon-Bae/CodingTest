def solution(my_string):
    answer = ''
    str = list(['a','e','i','o','u'])
    for x in my_string:
        if x not in str:
            answer = answer + x
    return answer