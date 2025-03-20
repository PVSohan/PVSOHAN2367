#include<stdio.h>
int main()
{
    float temparature[7],totaltemp=0,Avgtemp=0;
    int i;
    printf("Enter the temperatures of each day in a week\n");
    for(i=0;i<7;i++)
    {
        scanf("%f",&temparature[i]);
    }
    printf("The recorded temperatures are:\n");
    for(i=0;i<7;i++)
    {
        printf("%f ",temparature[i]);
    }
    for(i=0;i<7;i++)
    {
        totaltemp+=temparature[i];
    }
    Avgtemp=totaltemp/7;
    printf("\nThe average temperature for the week is %f",Avgtemp);
}
