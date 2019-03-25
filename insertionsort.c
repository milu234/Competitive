#include<stdio.h>


void insertionSort(int *,int);

int main()
{
	int n,arr[100];
	int i;

	printf("\n\nHOW MANY NUMBERS ARE THERE : \t");
	scanf("%d",&n);

	printf("\n\nENTER NUMBERS ONE BY ONE ....");
	for(i=0;i<n;i++)
	{
		printf("\nENTER NUMBER %d : ",i+1);
		scanf("%d",&arr[i]);
	}

	insertionSort(arr,n);

	printf("\n\nTHE SORTED ARRAY IS.... ");
	for(i=0;i<n;i++)
	{
		printf("\n %d",arr[i]);
	}
	return 0;
}

void insertionSort(int x[], int n)
{
	int i,k,y;
	for(k=1;k<n;k++)
	{
		y = x[k];
		//printf("%d" , y);
		for(i=k-1;i>=0 && y<x[i];i--)
			x[i+1] = x[i];
		x[i+1] = y;

	}
}
