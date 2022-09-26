//program to compute Quotient and Reminder
int main()
{
    int dividend,divisor,quotient,reminder;
    printf("Enter dividend: ");
    scanf("%d",&dividend);
    printf("Enter divisor: ");
    scanf("%d",&divisor);

    //compute quotient
    quotient=dividend/divisor;

    //compute reminder
    reminder=dividend%divisor;

    printf("Quotient=%d\n",quotient);
    printf("Reminder=%d",reminder);

    return 0;
}
