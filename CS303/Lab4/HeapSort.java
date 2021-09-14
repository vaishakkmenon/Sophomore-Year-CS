package CS303.Lab4;

public class HeapSort
{
    public int[] sort(int[] A)
    {
        int n = A.length-1;

        for(int i = n/2; i >= 1; i--)
        {
            maxHeapify(A, n, i);
        }

        for (int i = n; i > 1; i--) 
        {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            maxHeapify(A, i, 0);
        }

        return A;
    }

    
    public void maxHeapify(int[] A, int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        
        if(l < n &&  A[l] > A[largest])
            largest = l;

        if(r < n &&  A[r] > A[largest])
            largest = r;

        if(largest != i)
        {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A,n,largest);
        }

    }
    
}
