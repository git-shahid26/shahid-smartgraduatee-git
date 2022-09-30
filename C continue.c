//program to calculate the sum of numbers(10 numbers max)
//if the user enters a negative number,it's not added to the result
#include<stdio.h>
int main()
{
    int i;
    double number,sum=0.0;

    for(i=1;i<=10;++i)
    {
        printf("Enter a n%d",i);
        scanf("%lf",&number);

        if(number<0.0)
        {
            continue;
        }
        sum+=number;
    }
    printf("sum=%.2lf",sum);

    return 0;
}
