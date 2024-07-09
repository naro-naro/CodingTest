def solution(binomial):
    splitlist = binomial.split()
    answer = int(splitlist[0])
    b = int(splitlist[2])
    if splitlist[1] == '+':
        answer += b
    elif splitlist[1] == '-':
        answer -= b
    elif splitlist[1] == '*':
        answer *= b
    return answer