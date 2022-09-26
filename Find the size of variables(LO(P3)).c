//program to find size of variables
#include<stdio.h>
int main()
{
    int intType;
    float floatType;
    double doubleType;
    char charType;

    //size of evalulates the size of a variables
    printf("Size of int:%zu bytes\n",sizeof(intType));
    printf("Size of int:%zu bytes\n",sizeof(floatType));
    printf("Size of int:%zu bytes\n",sizeof(doubleType));
    printf("Size of int:%zu byte\n",sizeof(charType));

    return 0;




}
