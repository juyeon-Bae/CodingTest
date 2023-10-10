#include <stdio.h>
#define LEN_INPUT 11

int main(void) {
 char s[LEN_INPUT];
    int a;
    scanf("%s %d",s,&a);
    for(int i=0; i<a; i++){
        printf("%s",s);
    }
    
    return 0;
}