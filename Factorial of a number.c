//factorial of a number
#include<stdio.h>
int main(){
    int n,i;
    unsigned long long fact=i;
    printf("Enter an integer:");
    scanf("%d",&n);

    if(n<0)
        printf("Error! factorial of negative number doesn't exist.");
    else{
        for(i=1;i<=n;++i){
            fact*=i;
        }
        printf("Factorial of %d=%llu",n,fact);
    }

    return 0;

}
