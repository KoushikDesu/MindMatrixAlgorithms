#include <stdio.h>
int max = 0, s = 0;
int in = 0;
char p;
void check(char c){
    if (p == c)
        s = s + 1;
    else{
        max = (max > s) ? max : s;
        s = 1;
        p = c;
    }
}
int main(){
    char k[1000000];
    scanf("%s", k);
    p = k[0];
    while(k[in] != '\0'){
        check(k[in]);
        in++;
    }
    max = (max > s) ? max : s;
    printf("%d", max);
    return 0;
}