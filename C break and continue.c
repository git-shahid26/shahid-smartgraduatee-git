//program to calculate the sum of numbers(10  numbers max)
//if the user enters a negative number,the loop terminates
#include<stdio.h>
int main()
{
    int i;
    double number,sum=0.0;

    for (i=1;1<=10;++i)
    {
        printf("Enter n%d",i);
        scanf("%lf",&number);

        if (number<0.0)
        {
            break;
        }
        sum+=number;


    }

    printf("sum=%.2lf",sum);

    return 0;
}
