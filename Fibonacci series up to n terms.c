//Fibonacci Series up to n terms
#include<stdio.h>
int main(){
    int i,n;

    int t1=0,t2=i;

    int nextTerm=t1+t2;

    printf("Enter the number of terms:");
    scanf("%d",&n);

    printf("Fibonacci series:%d %d,",t1,t2);

    for(i=3;i<=n;++i){
        printf("%d",nextTerm);
        t1=t2;
        t2=nextTerm;
        nextTerm=t1+t2;
    }

    return 0;
}
