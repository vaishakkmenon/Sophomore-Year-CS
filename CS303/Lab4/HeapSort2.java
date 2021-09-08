package CS303.Lab4;

public class HeapSort2 
{
    public void sort(int[] A)
    {
        int n = A.length;
        buildMaxHeap(A);
        for (int i = n; i > 0; i--) 
        {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            n -= 1;
            maxHeapify(A, n, i);
        }
    }

    public void buildMaxHeap(int[] A)
    {
        int n = A.length;
        for(int i = A.length/2; i >= 1; i--)
        {
            maxHeapify(A, n, i);
        }
    }

    public void maxHeapify(int[] A, int n, int i)
    {
        int largest = i;
        int l = LEFT(i);
        int r = RIGHT(i);
        
        if(l <= n &&  A[l] > A[i])
            largest = l;
        else
            largest = i;

        if(r <= n &&  A[r] > A[largest])
            largest = r;
        if(largest != i)
        {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A,n,largest);
        }

    }    

    public int PARENT(int i)
    {
        return i/2;
    }

    public int LEFT(int i)
    {
        return 2*i;
    }

    public int RIGHT(int i)
    {
        return 2 * i + 1;
    }
}
