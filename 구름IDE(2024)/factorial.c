#include<stdio.h>
int main(){
	
	int n;  
	int s=1000000007; //나눈 값
	unsigned long long result = 1; //결과값: 숫자의 크기 크므로 unsigned long long을 사용함 
	scanf("%d",&n); 
	for(int i=1; i<=n; i++){
		result = (result*i)%s; 
}
printf("%llu" ,result);
	
	return 0;
}
