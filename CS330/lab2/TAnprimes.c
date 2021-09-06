#include<stdio.h>  // needed for printf
#include<stdlib.h>  // needed for atoi
/* (for each function make these comments)
description:
arguments:
returns:
*/

/*
design
loop (i) through 2 to n
    for each i, check if it's prime
    loop (f) 2 to n
        check i%f == 0
            then it's a factor, i is not prime
            exit loop
        print primes
*/

/*
description: prints all the prime numbers from 1 to n
arguments: takes an int n
returns: nothing
*/
void printPrimes(int n){
    int i;
    int f;
    int isItPrime = 1; // flag, 1 == prime, 0 ==not prime
    for(i = 2; i <=n; i++){  // loop through all the numbers from 2 to n
        for(f = 2; f < i; f++){  // for each i, loop through and check to see
                                // if f is a factor of i
            if(i%f == 0){  // f is a factor of i, i is not prime
                isItPrime = 0;  // set flag so later we can determine whether to print
                break;  // if we've found a factor, stop looping
            }
        }
        if(isItPrime == 1){  // if it's prime, print it
            printf(" %d", i);
        } else {  // else reset and get ready for next time
            isItPrime = 1;
        }
    }
    printf("\n");
    return;
} // end printPrimes

/* if we want to take command line arguments,
the main method will have an array of strings,
as an argument, like in Java: 
public static void main(String[] args)
*/
int main(int argc, char **argv){
    int n;
    /* Option 1: hard code */
    n = 10;

    /* Option 2: command line inputs */
    n = atoi(argv[1]);  // atoi casts string to integer

    /* Option 3: user terminal input
    we'll cover this next week */

    printf("These are all the primes from 1 to %d\n", n);

    printPrimes(n);
    return 0;
} // end main