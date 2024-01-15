time = input()
time_list = time.split()
h = int(time_list[0])
m = int(time_list[1])
if h>0:
    if m>=45:
        print(f"{h} {m-45}")
    else:
        print(f"{h-1} {m+15}")
elif h==0:
    if m>=45:
        print(f"{h} {m-45}")
    else:
        print(f"23 {m+15}")