#include <stdio.h>

int contador;

main()
{
    for (contador = 1;contador <= 100; contador++ )
    {
        if (contador % 3 == 0 && contador % 5== 0)
        {
            printf("Fizz buzz\n");
        }
        else if (contador % 3 == 0)
        {
            printf("Fizz\n");
        }
        else if (contador % 5 == 0)
        {
            printf("Buzz\n");
        }
        else{
            printf("%d\n",contador);
        }

        
    } 
return 0;
}