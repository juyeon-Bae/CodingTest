#include <stdio.h>
#define N 11
int main(void) {
     char str[N];
    scanf("%s",&str);
    int len = strlen(str); //문자의 길이
    for(int i=0; i<len; i++){
        printf("%c\n",str[i]);
    }
    
  

    return 0;
}
