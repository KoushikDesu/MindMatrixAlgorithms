n = int(input())
k = list(map(int, input().split()))
s = 0
for i in range(1, n):
    if k[i] < k[i - 1]:
        s += k[i - 1] - k[i]
        k[i] = k[i - 1]
print(s)