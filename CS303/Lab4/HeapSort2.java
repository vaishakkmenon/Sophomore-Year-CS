package CS303.Lab4;

public class HeapSort2 
{
    public void maxHeapify(int[] A, int n, int i)
    {
        int largest;
        int l = LEFT(i);
        int r = RIGHT(i);
        
        if(l <= n &&  A[l] > A[i])
            largest = l;
        else
            largest = i;

        if(r <= n &&  A[r] > A[i])
            largest = r;
        if(largest != i)
        {
            A[i] = A[largest];
            maxHeapify(A,i,largest);
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
