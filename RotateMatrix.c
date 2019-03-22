#include <stdio.h>
int main()
{
    int rows , cols , rot;
    scanf("%d %d %d" , &rows , &cols , &rot);
    int arr[rows][cols];
    int result[rows][cols];

    for(int r = 0 ; r < rows ; r++)
        for(int c = 0 ; c < cols ; c++)
            scanf("%d" , &arr[r][c]);
}
