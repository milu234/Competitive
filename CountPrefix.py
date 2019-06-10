def subString(s,n):
  for i in range(n):
      for len in range(i+1,n+1): 
          subStringList.append(s[i: len])

def checkAnagram(subStringList,firstChar):
  for string in subStringList:
    if(sorted(string) == sorted(firstChar)):
      return 'YES'
    else:return 'NO'

subStringList = []
inp = str(input())
num = int(input())
firstChar = ""
subString(inp,len(inp))
for i in range(num):
  move = str(list(input()))
  print(move)
  direct = move[0]
  steps = int(move[2])
  if direct == 'L':
    Lfirst = inp[0:steps]
    Lsecond = inp[steps:]
    firstChar+=str(Lsecond[0])
  elif direct == 'R':
    Rfirst = inp[0:len(string)-steps]
    Rsecond = inp[len(string)-steps:]
    firstChar+=str(Rsecond[0])

print(checkAnagram(subStringList,firstChar))

