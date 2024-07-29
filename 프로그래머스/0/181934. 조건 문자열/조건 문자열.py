def solution(ineq, eq, n, m):
    if ineq == ">":
        if eq == "=":
            result = (n >= m)
        else:
            result = (n > m)
    else:
        if eq == "=":
            result = (n <= m)
        else:
            result = (n < m)
    if result == True: answer = 1
    else: answer = 0
    return answer