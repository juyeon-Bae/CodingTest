#include <stdio.h>
 

int main(void) {
    
   char str1[10];
   char str2[10];
    
  scanf("%s %s", &str1, &str2);
     strcat(str1, str2);
  printf("%s",str1);

    return 0;
}