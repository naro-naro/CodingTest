def solution(arr, queries):
    a = 0;
    for i in queries:
            a = arr[i[0]]
            arr[i[0]] = arr[i[1]]
            arr[i[1]] = a
    return arr