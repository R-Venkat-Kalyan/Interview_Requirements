import math
from collections import defaultdict
mod = 998244353

def lcm(a, b):
    return abs(a*b) // math.gcd(a, b)

def solve(arr, x):
    n = len(arr)
    dp = defaultdict(int)
    for num in arr:
        if x % num != 0:
            continue
        newdp = defaultdict(int)
        newdp[num] += 1
        for cur_lcm in dp:
            new_lcm = lcm(cur_lcm, num)
            if new_lcm <= x and x % new_lcm == 0:
                newdp[new_lcm] = (newdp[new_lcm] + dp[cur_lcm]) % mod
        for key, value in newdp.items():
            dp[key] = (dp[key] + value) % mod
    return dp[x] % mod

n, x = list(map(int, input().split()))
arr = list(map(int, input().split()))

print(solve(arr, x))


----------------------------------------------------------------------------------------------------------------------------



def solve(arr):
    if not arr:
        return 1
    n = len(arr)
    directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]
    dp = [[-1] * n for _ in range(n)]

    def dfs(i, j):
        if dp[i][j] != -1:
            return dp[i][j]
        
        max_length = 1
        for dx, dy in directions:
            x, y = dx + i, dy + j
            if 0 <= x < n and 0 <= y < n and arr[x][y] == arr[i][j] + 1:
                length = 1 + dfs(x, y)
                max_length = max(max_length, length)
        
        dp[i][j] = max_length
        return max_length

    max_length = 1
    for i in range(n):
        for j in range(n):
            max_length = max(max_length, dfs(i, j))

    return max_length
n=int(input)
arr = []
for i in range(n):
	arr.append(list(map(int, input().split())))
res = solve(arr)
print(res)