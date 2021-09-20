/* Author: Vaishak Menon, Date: 09/06/2021*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void insertionSort(int *A)
{
    int i, key;
    for(i = 0; i < 100; i++)
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

    insertionSort(ptr);

    selectionSort(ptr2, arraySize);

    return 0;
}