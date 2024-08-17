def solution(n, arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        a = bin(arr1[i])[2:]
        b = bin(arr2[i])[2:]
        if len(a) < n:
            a = '0'*(n - len(a)) + a
        if len(b) < n:
            b = '0'*(n - len(b)) + b
        print(a, b)
        c = ''
        for j in range(len(a)):
            if (a[j] == '0') & (b[j] == '0'):
                c += ' '
            else:
                c += '#'
        answer.append(c)
    return answer