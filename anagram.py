
def check(s1, s2):
    # the sorted strings are checked
    if (sorted(s1) == sorted(s2)):
        print("YES")
    else:
        print("NO")

        # driver code
n = int(input())
for i in range(n):
    s1 = input()
    s2 = input()
    check(s1, s2)

