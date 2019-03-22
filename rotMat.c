
#include <stdio.h>
int main()
{
    int rows , cols , rot;
    scanf("%d %d %d" , &rows , &cols , &rot);
    int arr[rows][cols];
    int result[rows][cols];
    int x;
    int y;
    int min;
    int maxRow;
    int maxCol;
    int parameter;
    int a;
    int r;
    int c;


    for(int r = 0 ; r < rows ; r++){
        for(int c = 0 ; c < cols ; c++){
            scanf("%d" , &arr[r][c]);
        }
    }



    rows--;
    cols--;

    for(int r = 0 ; r <= rows ; r++){
        for(int c = 0 ; c <= cols ; c++){
            int x = r < rows-r ? r : rows-r;
            int y = c < cols-c ? c : cols-c;
            int min = x < y? x:y;
            int maxRow = rows - min;
            int maxCol = cols - min;
            int parameter = (maxRow + maxCol)*2 - (min*4) ;

            int rows = r;
            int cols = c;
            for(int a = 0 ; a <= rot%parameter ; a++)
            {
                if(cols == min && rows < maxRow){
                    rows++;
                }
                else if(rows == maxRow && cols < maxCol){
                    cols++;
                }
                else if(rows > min && cols == maxCol ){
                    rows--;
                }
                else if(cols > min && rows == min){
                    cols--;
                }
            }
            result[rows][cols] = arr[r][c];



        }
    }


for (int r = 0; r <= rows; r++) {
        for (int c = 0; c <= cols; c++) {
            printf("%d ", result[r][c]);
        }
        printf("\n");
    }



}


