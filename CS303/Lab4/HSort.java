package CS303.Lab4;

public class HSort 
{
    void sort(int[] A)
    {
        buildMaxHeap(A);
        for(int i = A.length-1; i >= 2; i--)
        {

            int temp = A[1];
            A[1] = A[i];
            A[i] = temp;

            maxHeapify(A , 1);

        }
    }
    
    void buildMaxHeap(int[] A)
    {
        int size = A.length-1;
        for(int i = size/2; i >= 1; i--)
        {
            maxHeapify(A, i);
        }
    }

    void maxHeapify(int[] A, int i)
    {
        int largest = 0;
        int size = A.length-1;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if(l <= size && A[l] > A[i])
            largest = l;
        else
            largest = i;

        if(r <= size && A[r] > A[largest])
            largest = r;
        
        if(largest != i)
        {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A, largest);
        }
    }
}
