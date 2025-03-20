#include<Stdio.h>
int main()
{
	int i,j,a[4][4],key,row,col,temp,temp1;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	printf("enter the element u waant to insert and position too");
	scanf("%d%d%d",&key,&row,&col);
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			if(i==row && col==j)
			{
				temp=a[i][j];
				a[i][j]=key;
				key=temp;
			}
			if(i!=row && col!=j)
			{
				temp1=a[i][j];
				a[i][j]=key;
				key=temp1;
			}     
		}
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",a[i][j]);
		}
		printf("\n");
	}
	
}
