def solution(my_string):
    answer = ''
    list = []
    for i in my_string.lower():
        list.append(i)
    list.sort()
    for j in list:
        answer += j
    return answer