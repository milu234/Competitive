def isNumericChar(x):
    if(x >= '0' and  x <='9'):
        return  True
    else:
        return False

def myAtoi(string):
    if len(string) == 0:
        return 0

    res = 0

    #initialize sign as positive
    sign = 1
    i = 0


    #if negative then update the sign

    if string[0] == '-':
        sign = -1
        i+=1


        #iterate through all the characters
        for j in range(i,len(string)):
            #Write the error
            if isNumericChar(string[j]==False):
                return  0

            res = res*10 + (ord(string[j])-ord('0'))

        return sign*res
    #Driver Program

string = "-134"
print(myAtoi(string))