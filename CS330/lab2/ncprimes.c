#include <stdio.h>
#include <stdlib.h>


/*
Psuedocode

loop (i) 2-n
    loop (j) 2-i
        if i % f == 0, f is a factor if true
        end
    print prime;
*/

void printPrimes(int n)
{
    int i, f;
    int isItPrime; // if prime = 1; else = 0
    for(i = 2; i <= n; i++)
    {
        for(f = 2; f < i; f++)
        {
            if(i % f == 0)
            {
                // this is a factor, not prime
                isItPrime = 0;
                break;
            }
            
        }
        if(isItPrime == 1)
        {
            printf(" %d", i);
        }
        else
        {
            isItPrime = 1;
        }
    }

    printf("\n");
    return;
}

int main(int argc, char **argv)
{
    int n = 10;

    /* command line */
    n = atoi(argv[1]);

    printf("All the primes from 1 to %d\n", n);

    printPrimes(n);
    return 0;
}