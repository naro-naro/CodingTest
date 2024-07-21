def solution(s):
    answer = ''
    li = []
    for i in s:
        li.append(i)
    li.sort(reverse=True)
    print(li)
    for i in li:
        answer += i
    return answer