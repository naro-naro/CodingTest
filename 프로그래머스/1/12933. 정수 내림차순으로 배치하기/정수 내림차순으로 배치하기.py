def solution(n):
    str1 = str(n)
    answer1 = []
    answer = ""
    for i in str1:
        answer1.append(i)
    answer1.sort()
    answer1.reverse()
    for i in answer1:
        answer += i
    answer = int(answer)
    return answer