package CS303.Lab5;

public class QuickSort 
{
    public void sort(int[] A, int p, int r)
    {
        if(p < r)
        {
            int q = Partition(A, p, r);
            sort(A, p, q-1);
            sort(A, q+1, r);
        }
    }

    public int Partition(int[] A, int p, int r)
    {
        int x = A[r];
        int i = p - 1;

        for(int j = p; j <= r - 1; j++)
        {
            if(A[j] <= x)
            {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        
        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        return i + 1;
    }
}