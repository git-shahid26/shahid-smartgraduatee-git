#include<stdio.h>
int main()
{
    char chr;
    printf("Enter a character:");
    scanf("%c",&chr);

    //when %c is used a character is displayed
    printf("you entered %c.\n",chr);
    //when %d is used,ASCII value is displayed
    printf("ASCII value is %d",chr);
    return 0;

}
