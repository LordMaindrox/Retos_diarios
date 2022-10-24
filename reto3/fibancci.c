#include<stdio.h>
int main(){
    
    int num1 = 0, num2 = 1, result;

    int fibonacci[20];
    for (int i = 0; i < 20; i++)
    {
        result = num1 + num2;
        fibonacci[i] = result;
        num1 = num2;
        num2 = result;
        printf("%d\n", fibonacci[i]);
    }
    return 0;

}
