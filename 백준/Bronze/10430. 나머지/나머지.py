# 첫째 줄에 (A+B)%C, 
# 둘째 줄에 ((A%C) + (B%C))%C, 
# 셋째 줄에 (A×B)%C, 
# 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

nums = input()
nums_list = nums.split()
A = int(nums_list[0])
B = int(nums_list[1])
C = int(nums_list[2])
print((A+B)%C)
print(((A%C) + (B%C))%C)
print((A*B)%C)
print(((A%C) * (B%C))%C)