# subStringList = []
from collections import Counter

def anagram(S,firstChar):
  if(Counter(S) == Counter(firstChar) ):
    return "YES"
  else:
    return "NO"
# def subString(s,n):
#   for i in range(n):
#       for len in range(i+1,n+1): 
#           subStringList.append(s[i: len])

# def checkAnagram(subStringList,firstChar):
#   for string in subStringList:
#     if(sorted(string) == sorted(firstChar)):
#       return 'YES'
#     else:return 'NO'

S = input()
K = int(input())
x=[]
m = []
n= []
subString(S,len(S))
for i in range(K):
  x = list(map(str, input().split()))
  d = (x[0])
  r = x[1]
  m.append(d)
  n.append(r)
firstChar = ""
for k in range(len(m)):
  if(m[k] == "L"):
    Lfirst = S[0:int(n[k])]
    Lsecond = S[int(n[k]) :]
    #print(Lsecond+Lfirst)
    firstChar+=str(Lsecond[0])
  elif(m[k] == "R"):
    Rfirst = S[0:len(S)-int(n[k])]
    Rsecond = S[len(S)-int(n[k]):]
    #print(Rsecond+Rfirst)
    firstChar+=str(Rsecond[0])

print(anagram(S,firstChar))