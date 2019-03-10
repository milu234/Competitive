def gcd(a,b):
    if(a == b):
        return a
    if(a > b):
        return gcd(a-b,a)
    return gcd(a, b-a)

def lcm(a,b):
    return (a*b)/gcd(a,b)

T = int()
for i in range(T):
    N , A , B , K  = map(int, input().split()) 
    if (N/A + N/B-2*N/lcm(A,B) < K):
        print("Lose")
    else:
        print("Win")
	
