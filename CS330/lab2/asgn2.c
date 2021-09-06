/* Author: Vaishak Menon, Date: 09/06/2021*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void cubeOfOdd(int n)
{
    // Initialization of all variables
    int i, j;
    double a;

    printf("All prime numbers cubed from 1 to %d:", n);
    printf("\n");
    
    //For loop to go through numbers from i to n
    for(i = 1; i < n; i++)
    {
        //If statement to check if i is an even number or not
        if(i % 2 != 0)
        {
            //If the if statement is true, takes the cube and turns it back into an int to print to terminal
            a = pow(i,3);
            j = (int) a;
            printf("%d ",j);
        }
    }
}

void introToCS330(int n)
{
    //Checks if it is a prime first
    if(n != 3 && n != 7)
    {
        
        int i;
        int isItPrime = 1;
        for(i = 2; i < n; i++)
        {  
            if(n % i == 0)
            {
                isItPrime = 0;
            }
        }

        if(isItPrime == 1)
        {
            printf("This number is a prime: %d",n);
            printf("\n");
        }

    }

    //Checks divisibility against 3 AND 7
    if(n % 3 == 0 && n % 7 == 0)
    {
        printf("UAB CS 330");
    }
    //Checks divisibility for just 3
    else if(n % 3 == 0)
    {
        printf("CS");
    }
    //Checks divisibility for just 7
    else if(n % 7 == 0)
    {
        printf("UAB");
    }
    //Prints cube if all else fails
    else
    {
        double a = pow(n,3);
        int b = (int) a;
        printf("This number failed all other checks, here is num %d cubed: %d", n, b);
    }
    
}

void printHello(int n)
{

    int i, j = 1;
    //Loops from 0 to n
    for(i = 0; i <= n; i++)
    {
        //If j ever equals i it will print hello
        //j will get multiplied by 2 everytime it reaches this point to go to the next power of 2
        if(j == i)
        {
            printf("Hello");
            j = j * 2;
        }
        //Prints out numbers since i was not a power of 2
        else
        {
            printf("%d",i);
        }
    }
}

void paintGallons(float l, float w, float h)
{
    
    const float perGallon = 400;
    //Calculates all side and ceiling areas
    float side1 = 2 * (l * h);
    float side2 = 2 * (w * h);
    float ceiling = (l * w);

    //Adds all areas together
    float total = side1 + side2 + ceiling;

    //Finds maximum cans needed to paint entire room
    float cansNeeded = ceil(total / perGallon);
    printf("%f",cansNeeded);
}

void grader(float aGrade, float aHW, int attendance)
{
    const char p[] = "PASS";
    const char f[] = "FAIL";
    const int minAttendance = 20;
    const float secondMin = 70;
    const float thirdMin = 85;

    //Checks if attendance is greater than 20
    if(attendance > minAttendance)
    {
        //Checks if both grade AND hw is greater than 70
        if(aGrade > secondMin && aHW > secondMin)
        {
            //Checks to make sure at least grade OR hw is 85
            if(aGrade < thirdMin || aHW < thirdMin)
            {
                printf("%s",p);
            }
            //Prints fail if last check fails
            else
            {
                printf("%s",f);
            }
        }
        //Prints fail if second check fails
        else
        {
            printf("%s",f);
        }
    }
    //Prints fail if first check fails
    else
    {
        printf("%s",f);
    }
    

}

int main()
{
    int n;
    float l, w, h, g;
    /*
    //Hardcoded n value for testing
    n = 15;
    */

    //cubeOfOdd()
    printf("Enter an input number for cubeOfOdd: ");
    scanf("%d", &n);
    cubeOfOdd(n);
    printf("\n");

    //introToCS330()
    printf("Enter an input number for introToCS330: ");
    scanf("%d", &n);
    introToCS330(n);
    printf("\n");

    //printHello()
    printf("Enter an input number for printHello: ");
    scanf("%d", &n);
    printHello(n);
    printf("\n");

    //paintGallons()
    printf("Enter an input numbers for paintGallons: \n");
    printf("Length: ");
    scanf("%f", &l);
    printf("\nWidth: ");
    scanf("%f", &w);
    printf("\nHeight: ");
    scanf("%f", &h);
    paintGallons(l, w, h);
    printf("\n");

    //grader()
    printf("Enter an input numbers for grader: \n");
    printf("Average Grade: ");
    scanf("%f", &g);
    printf("\nAverage HW: ");
    scanf("%f", &h);
    printf("\nAttendance: ");
    scanf("%d", &n);
    grader(g, h, n);
    printf("\n");

    return 0;
}