/* Author: Vaishak Menon, Date: 09/06/2021*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Insertion Sort algorithm
void insertionSort(int *A, int size)
{
    //Declare both i and key
    int i, key;
    for(i = 0; i < size; i++)
    {
        //Assign key to be whatever value A[i] is
        key = *(A + i);
        int j = i - 1;
        while(j >= 0 && key < *(A + j))
        {
            //if(j is greater that zero and the key is less than A[j])
            //switch A[j+1] with A[j]
            *(A + (j + 1)) = *(A+ j);
            j -= 1;
        }
        //Make A[j+1] equal to the key
        *(A + (j + 1)) = key;
    }
}

//Selection Sort Algorithm
void selectionSort(int *nums,int size)
{
    //Declare i and minValueIndex
    int i, minValueIndex;
    for(i = 0; i < size-1; i++)
    {
        //Set minValueIndex to i
        minValueIndex = i;
        int j;
        for(j = i + 1; j < size; j++)
        {
            //if(nums[j]) is less than nums[minValueIndex]
            //set minValueIndex to j
            if(*(nums + j) < *(nums + minValueIndex))
            {
                minValueIndex = j;
            }
        }
        //If minValueIndex is not equal to i
        //switch i with minValueIndex
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
    //Declare nad initialize all variables and pointers
    FILE numF;
    int size = 290;
    char nums[size];
    int arraySize = 100;
    int fileNum[arraySize];
    int fileNum2[arraySize];
    int *ptr = fileNum;
    int *ptr2 = fileNum2;

    //Read in file with random numbers
    numF = fopen("input_100.txt", "r");
    fgets(nums, 290, numF);
    fclose(numF);

    char *token = strtok(nums, " ");

    //Add all integers into the arrays
    int i = 0;
    while(token != NULL)
    {
        fileNum[i] = atoi(token);
        fileNum2[i] = atoi(token);
        token = strtok(NULL, " ");
        i++;
    }    

    //Call both functions on the arrays
    //I passed the size in because the pointer size always ends up as 2 and stops my code from working
    insertionSort(ptr, arraySize);
    selectionSort(ptr2, arraySize);.

    return 0;
}