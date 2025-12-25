#include <stdio.h>

int main(){
    long int k[200000], n, s;
    int i;
    scanf("%ld", &n);
    for(i = 0; i < n; i++){
        scanf("%ld", &k[i]);
    }
    s = 0;
    for(i = 1; i < n; i++){
        if(k[i] < k[i - 1]){
            s += k[i - 1] - k[i];
            k[i] = k[i - 1];
        }
    }
    printf("%ld\n", s);
    return 0;
}