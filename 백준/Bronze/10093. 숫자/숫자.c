 #include<stdio.h>
 int main(){
 unsigned long long a,b,c,i;
 scanf("%lld %lld",&a,&b);
 if(a<b){
 	c=b-a-1;
 	printf("%lld\n",c);
 	for(i=a+1; i<b; i++){
 		printf("%lld ",i);
	 }
 }
 else if(a>b){
 	c = a-b-1;
 	printf("%lld\n",c);
 	for(i=b+1; i<a; i++){
 		printf("%lld ",i);
	 }
 }
     else{
         printf("0");
     }
 	return 0;
 }