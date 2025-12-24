k = input()
max = 0
p = k[0]
s = 1
for i in range(1, len(k)):
    if p == k[i]:
        s += 1
    else:
        max = max if max > s else s
        s = 1
        p = k[i]

max = max if max > s else s
print(max)