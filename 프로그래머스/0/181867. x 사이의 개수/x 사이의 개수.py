def solution(myString):
    answer = []
    spl = myString.split('x')
    answer = list(map(lambda x : len(x), spl))
    return answer