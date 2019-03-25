def insertionsort(k):
    for i in range(1, len(k)):
        temp = k[i]
        j = i -1
        while(j >=0 and temp < k[j]):
            k[j+1] = k[j]
            j =j-1
        k[j+1] = temp
        #print(k)
        string = ' '.join(str(e) for e in k)
        print(string)
        
        

n = int(input())
k = input().split()
k = [int(x) for x in k]
insertionsort(k)
# print(k)
    