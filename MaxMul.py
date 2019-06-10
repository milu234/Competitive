def solve (A,N):
    
    if(N < 2):
        print("0")
        return
    
    if(N == 2):
        return (A[0]*A[1])
        return
    
    
    posa = 0
    posb = 0 
    
    nega = 0
    negb = 0
    
    for i in range(len(list(A))):
        if(A[i] > posa):
            posb = posa 
            posa = A[i]
            
        elif(A[i] > posb):
            posb = A[i]
            
        if(A[i] < 0 and abs(A[i]) > abs(nega)):
            negb = nega
            nega = A[i]
            
        elif(A[i] < 0 and abs(A[i]) > abs(negb)):
            negb = A[i]
    if(nega*negb > posa*posb):
        return nega*negb
    else:
        return posa*posb
    
    
    
T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))
    out_ = solve(A,N)
    print (out_)