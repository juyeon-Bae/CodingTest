#include <stdio.h>
#include <string.h>

char* solution(char* my_string, char* overwrite_string, int s) {
    int overwrite_len = strlen(overwrite_string); // overwrite_string 문자열의 길이

    // my_string의 s부터 overwrite_string의 길이만큼을 overwrite_string으로 대체
    strncpy(my_string + s, overwrite_string, overwrite_len);

    return my_string;
}

int main() {
    char my_string[1000];
    char overwrite_string[1000];
    int s;

     
    scanf("%s %s %d", my_string, overwrite_string, &s);

    // solution 함수 호출하여 결과 출력
    printf("%s\n", solution(my_string, overwrite_string, s));

    return 0;
}
    