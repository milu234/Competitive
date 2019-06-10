T = int(input())
for k in range(T):
    
    N = int(input())
    arr = list(map(int , input().split()))
    n = len(arr)
    def pairAndSum(arr, n) : 
    	ans = 0
    	for i in range(0,n) : 
    		for j in range((i+1),n) :
    
    			ans  = ans +(((arr[i] | arr[i]) + (arr[j] | arr[i]) + (arr[j] | arr[j]) + (arr[i] | arr[i]))%(10**9+7))
    			
    
    	return ans
print(pairAndSum(arr, n)) 

