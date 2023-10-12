#include <stdio.h>
int main(){
    //a:97, b:122
    //A:65 B:90
    
   char str[20];
   scanf("%s",&str);
    for(int i=0; i<=20; i++){
        if((str[i]>='A' &&str[i]<='Z')){
             str[i] +=32; //대문자->소문자
        }
        else if((str[i]>='a' && str[i]<='z'))
        {
            str[i] -= 32;
        }
    } //for
    printf("%s",str);
    
    return 0;
}