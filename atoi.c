#include<stdio.h>
#include<string.h>

int myAtoiRecursive(char *str,int n)
{
    if(n==1)
        return *str-'0';


    return (10*myAtoiRecursive(str,n-1)+str[n-1]-'0');
}
int main(void)
{
    char str[] = "112";
    int n = strlen(str);
    printf("%d",myAtoiRecursive(str,n));
    return 0;
}
