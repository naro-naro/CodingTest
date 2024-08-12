def solution(my_string, overwrite_string, s):
    answer = ''
    for i in range(s):
        answer += my_string[i]
    answer += overwrite_string
    if len(my_string) > (s + len(overwrite_string)):
        for j in range(len(my_string) -s -len(overwrite_string)):
            answer += my_string[s + len(overwrite_string) + j]
    return answer