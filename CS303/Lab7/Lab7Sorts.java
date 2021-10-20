/* Author: Vaishak Menon Date: 10/19/2021*/
package CS303.Lab7;

public class Lab7Sorts
{
    public void selectionSort(int[] A)
    {
        int length = A.length;
        for(int i = 0; i < length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < length; j++)
            {
                if(A[j] < A[min])
                {
                    min = j;
                }
            }
            if(i != min)
            {
                swap(A, min, i);
            }
        }
    }

    public void bubbleSort(int[] A)
    {
        int length = A.length;
        for(int i = 0; i < length -1; i++)
        {
            for(int j = length; j > i + 1; j--)
            {
                if(A[j-1] < A[j-2])
                {
                    swap(A, j-1, j-2);
                }
            }
        }
    }

    public void selectionSortR(int[] A)
    {
        int length = A.length;
        for(int i = 0; i < length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < length; j++)
            {
                if(A[j] > A[min])
                {
                    min = j;
                }
            }
            if(i != min)
            {
                swap(A, min, i);
            }
        }
    }

    public void bubbleSortR(int[] A)
    {
        int length = A.length;
        for(int i = 0; i < length -1; i++)
        {
            for(int j = length; j > i + 1; j--)
            {
                if(A[j-1] > A[j-2])
                {
                    swap(A, j-1, j-2);
                }
            }
        }
    }

    private void swap(int[] A, int a, int b)
    {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

}