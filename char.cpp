#include <stdio.h>
#include <string.h>
int main()
{	//�� �� ���ڿ� ���ϱ� 
	char str1[100];
	char str2[100];
	 
	scanf("%s\n %s",str1, str2);
 	
 	if(strlen(str1)>strlen(str2)){
 		printf("%s",str1);
	 }
	 else{
	 	printf("%s",str2);
	 }
	return 0;
}
