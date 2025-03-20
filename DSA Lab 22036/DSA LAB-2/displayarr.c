#include<Stdio.h>
#define max_rows 3
#define max_cols 3
void displayarray(int arr[max_rows][max_cols])
{
	int i,j;
	for(i=0;i<max_rows;i++)
	{
		for(j=0;j<max_cols;j++)
		{
			printf("%d\t",arr[i][j]);
		}
		printf("\n");
	}
}
void arr_mul(int arr1[max_rows][max_cols],int arr2[max_rows][max_cols],int arr3[max_rows][max_cols])
{
	int i,j,k;
	for(i=0;i<max_rows;i++)
	{
		for(j=0;j<max_cols;j++)
		{
			arr3[i][j]=0;
			for(k=0;k<max_cols;k++)
			{
				arr3[i][j]+=arr1[i][k]*arr2[j][k];
			}
		}
	}
}
int main()
{
	int arr1[max_rows][max_cols], arr2[max_rows][max_cols], arr3[max_rows][max_cols], i,j;
	printf("Enter the elements of array1\n");
	for(i=0;i<max_rows;i++)
	{
		for(j=0;j<max_cols;j++)
		{
			scanf("%d",&arr1[i][j]);
		}
		printf("\n");
	}
	printf("Enter the elements of array2\n");
	for(i=0;i<max_rows;i++)
	{
		for(j=0;j<max_cols;j++)
		{
			scanf("%d",&arr2[i][j]);
		}
		printf("\n");
	}
	printf("array1:\n");
	displayarray(arr1);
	printf("array2:\n");
	displayarray(arr2);
	printf("Resultant array after multiplication of 2 arrays is:\n");
	arr_mul(arr1,arr2,arr3);
	displayarray(arr3);
}
