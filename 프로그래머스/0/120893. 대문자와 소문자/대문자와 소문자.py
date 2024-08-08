def solution(my_string):
    answer = ''
    for i in my_string:
        if i.isupper() is True:
            answer += i.lower()
        else:
            answer += i.upper()
    return answer