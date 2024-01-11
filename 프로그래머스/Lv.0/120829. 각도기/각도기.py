def solution(angle):
    if angle==90:
        answer=2
    elif angle==180:
        answer=4
    elif 0<angle<90:
        answer=1
    elif 90<angle<180:
        answer=3
    return answer

angle1, angle2, angle3 = 70, 91, 180
solution(angle1)
solution(angle2)
solution(angle3)