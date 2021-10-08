/* Author: Vaishak Menon, Date: 09/06/2021*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void insertionSort(int *A, int size)
{
    int i, key;
    for(i = 0; i < size; i++)
    {
        key = *(A + i);
        int j = i - 1;
        while(j >= 0 && key < *(A + j))
        {
            *(A + (j + 1)) = *(A+ j);
            j -= 1;
        }
        *(A + (j + 1)) = key;
    }
}

void selectionSort(int *nums,int size)
{
    int i, minValueIndex;
    for(i = 0; i < size-1; i++)
    {
        minValueIndex = i;
        int j;
        for(j = i + 1; j < size; j++)
        {
            if(*(nums + j) < *(nums + minValueIndex))
            {
                minValueIndex = j;
            }
        }
        if(minValueIndex != i)
        {
            int temp = *(nums + i);
            *(nums + i) = *(nums + minValueIndex);
            *(nums + minValueIndex) = temp;
        }
    }
}

int main()
{
    FILE *numF;
    int size = 290;
    char nums[size];
    int arraySize = 100;
    int fileNum[arraySize];
    int fileNum2[arraySize];
    int *ptr = fileNum;
    int *ptr2 = fileNum2;

    numF = fopen("input_100.txt", "r");
    fgets(nums,290,numF);
    fclose(numF);

    char *token = strtok(nums, " ");

    int i = 0;
    while(token != NULL)
    {
        fileNum[i] = atoi(token);
        fileNum2[i] = atoi(token);
        token = strtok(NULL, " ");
        i++;
    }    

    printf("Unsorted Insertion Sort Array: \n");
    int a;
    for(a = 0; a < arraySize; a++)
    {
        printf("%d ",fileNum[a]);
    }

    insertionSort(ptr, arraySize);
    
    printf("\nSorted Insertion Sort Array: \n");
    int b;
    for(b = 0; b < arraySize; b++)
    {
        printf("%d ",fileNum[b]);
    }
    printf("\n\n");

    printf("Unsorted Selection Sort Array: \n");
    int c;
    for(c = 0; c < arraySize; c++)
    {
        printf("%d ",fileNum2[c]);
    }
    selectionSort(ptr2, arraySize);

    printf("\nSorted Selection Sort Array:\n");
    int d;
    for(d = 0; d < arraySize; d++)
    {
        printf("%d ",fileNum2[d]);
    }
    printf("\n");

    return 0;
}