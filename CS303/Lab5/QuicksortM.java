package CS303.Lab5;

public class QuicksortM 
{
    public void sort(int[] A, int p, int r)
    {
        if(p < r)
        {
            int N = r - p + 1;
            int m = median(A, p, p + N/2, r);

            int temp = A[m];
            A[m] = A[r];
            A[r] = temp;

            int q = Partition(A, p, r);
            sort(A, p, q-1);
            sort(A, q+1, r);
        }
    }

    public static int median(int[] A, int i, int j, int k)
    {

        //Original way of finding the median
        if((A[i] <= A[j] && A[j] <= A[k]) || (A[k] <= A[j] && A[j] <= A[i]))
        {
            return j;
        }
        else if((A[j] <= A[i] && A[i] <= A[k]) || (A[k] <= A[i] && A[i] <= A[j]))
        {
            return i;
        }
        else if((A[j] <= A[k] && A[k] <= A[i]) || (A[i] <= A[k] && A[k] <= A[j]))
        {
            return k;
        }
        else
        {
            return -1;
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
