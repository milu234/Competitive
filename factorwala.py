from functools import reduce

def factors(k, n):    
    return set(reduce(list.__add__, ([i, k//i] for i in range(1, int(k**0.5) + 1) if k % i == 0)))

def solve (Ar):
    # Write Your code here
    count = 0
    for i in Ar:
        count+=len([x for x in factors(i, n) if x<=n])
    return (count)
        

n = int(input())
Ar = list(map(int, input().split()))

out_ = solve(Ar)
print (out_)