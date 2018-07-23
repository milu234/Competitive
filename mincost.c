#include<stdio.h>
#include<math.h>
#include<limits.h>
#include<stdlib.h>
#define M 100

int max(int x, int y){ return (x>y) ? x:y; }
int min(int x, int y){ return (x<y) ? x:y; }
int minAdjustmentCost(int A[],int n,int target){

    int dp[n][M+1];
    int j,i,k;
    for(j=0;j<=M;j++)
    {
        dp[0][j] = abs(j-A[0]);
    }

    for(i=1;i<n;i++)
    {
        for(j=0;j<=M;j++)
        {
            dp[i][j] = INT_MAX;

            for(k=max(j-target,0);k<=min(M,j+target);k++)
            {
                dp[i][j] = min(dp[i][j], dp[i - 1][k] + abs(A[i] - j));
            }

        }




    }
     int res = INT_MAX;
     for (j = 0; j <= M; j++)
        {
            res = min(res, dp[n - 1][j]);
        }
        return res;
}

int main()
{
    int arr[M];
    int n;
    int target;
    int i;
    scanf("%d %d",&n,&target);
    for(i=0;i<=n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("%d",minAdjustmentCost(arr, n, target));
}
