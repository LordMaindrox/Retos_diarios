#include<stdio.h>

int main() 
{
    int myNum, control = 0, aux;
    printf("Write a numbre. Is a prime number?: \n");
    scanf("%d", &myNum);

    for ( int i = 2; i < myNum && control!= 1; i++)
    {
        aux = myNum % i;
        if (aux == 0){
            control = 1;
        }
    }

    if (control == 1){
        printf("%i No es primo", myNum);
    }
    else {
        printf("%i Si es primo", myNum);
    }
    return 0;
}