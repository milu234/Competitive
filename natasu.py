for t in range(int(input())):
    n = int(input())
    d = {}
    for i in range(n):
        s = input()
        d.setdefault(s,0)
        d[s] += 1
    k = sorted(zip(d.values(),d.keys()))
    for (i,j) in k:
        print(i, j)
