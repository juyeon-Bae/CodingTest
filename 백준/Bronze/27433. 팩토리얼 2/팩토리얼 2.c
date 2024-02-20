#include <stdio.h>

int main() {
   long long int multi = 1;
    int n;
    scanf("%d",&n);
    for(int i=1; i<=n; i++){
    	 multi *=i;
	}
	printf("%lld",multi);
    return 0;
}

