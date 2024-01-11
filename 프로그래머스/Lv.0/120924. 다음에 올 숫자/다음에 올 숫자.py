def solution(common):
    if common[1]-common[0] == common[2]-common[1]:
        answer = common[-1]+(common[1]-common[0])
    elif common[1]/common[0] == common[2]/common[1]:
        answer = common[-1]*(common[1]/common[0])
    return answer

common1, common2 = [1,2,3,4], [2,4,8]
solution(common1)
solution(common2)