#include<stdio.h>
int main(){
	
	int n;  
	int s=1000000007; //���� ��
	unsigned long long result = 1; //�����: ������ ũ�� ũ�Ƿ� unsigned long long�� ����� 
	scanf("%d",&n); 
	for(int i=1; i<=n; i++){
		result = (result*i)%s; 
}
printf("%llu" ,result);
	
	return 0;
}
