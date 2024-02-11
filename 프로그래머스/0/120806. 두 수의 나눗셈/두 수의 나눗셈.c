#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    
    double result = (double)num1/num2;
    result *=1000;
    return (int)result;
}