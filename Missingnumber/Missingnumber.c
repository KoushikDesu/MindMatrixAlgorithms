#include <stdio.h>
#include <stdlib.h>
 void main()
 {
     long int *p, k, s = 0;
     scanf("%ld", &k);
     p = (long int*)malloc((k-1)*sizeof(long int));
     for(int i = 0;i < k-1;i++)
     {
         scanf("%ld", (p + i));
         s = s + *(p + i);
     }
     k = (k * (k + 1))/2;
     printf("%ld", (k - s));
 }