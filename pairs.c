#include<stdio.h>
int main()
{
    int n , k ;
    scanf("%d %d", &n , &k);
    int arr[n];
    int count = 0;
    int temp ,a, i , j;

    for(i = 0 ; i < n ; i++)
    {
        scanf("%d" , &arr[i]);
    }

    for(i=0 ; i < n-1 ; i++)
    {
        for(j = i+1 ; j < n ; j++)
        {
            a = arr[i] + arr[j];
            if(a % k == 0 )
            {
                count++;
            }
        }
    }
    printf("%d" , count);
}
