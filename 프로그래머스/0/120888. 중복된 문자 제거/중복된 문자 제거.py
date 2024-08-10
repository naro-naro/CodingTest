def solution(my_string):
    answer = my_string[0]
    for i in range(1,len(my_string)):
        if my_string[i] in answer:
            continue
        else:
            answer += my_string[i]
    return answer