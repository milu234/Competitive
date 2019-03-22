#include<stdio.h>

int gcd(int a[] , int b)
{
    if(a == 0 || b ==0)
        return 0;

    if(a == b)
        return a;

     if(a > b)
        return gcd(a-b, b);
     return(a , b-a);
}

int lcm(int a[] , int b)
{
    return(a*b/gcd(a, b));
}

int main()
{
    int count = 0;
    int a[100];
    int b[100];
    int m;
    int n;
    int i;
    scanf("%d %d", &m , &n);

    for(i = 0 ; i<m ;i++)
    {
        scanf("%d" , &a[i]);
    }

    for(i = 0 ; i < n ; i++)
    {
        scanf("%d" , &b[i]);
    }


}
