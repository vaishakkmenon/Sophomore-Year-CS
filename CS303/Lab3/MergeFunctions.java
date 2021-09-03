package CS303.Lab3;

public class MergeFunctions
{

    //Original mergeSort
    public void mergeSort(int[] A, int p, int r)
    {
        if(p < r)
        {
            int q = ((p + r)/2);
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }

    }
    
    //Original merge function, need to ask about difference
    public void merge(int[] A,int p,int q,int r)
    {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++)
        {
            L[i] = A[p + i];
        }

        for(int j = 0; j < n2; j++)
        {
            R[j] = A[q + j];
        }

        int i = 0;
        int j = 0;

        for(int k = p; k < r; k++)
        {
            if(L[i] <= R[j])
            {
                A[k] = L[i];
                i++;
            }
            else
            {
                A[k] = R[j];
                j++;
            }
        }
    }

    /*
    public int[] newMerge(int[] array, int[] temp, int left, int mid, int right)
    {
        int i = left;
        int j = mid + 1;

        for(int k = left; k < right; k++)
        {
            temp[k] = array[k];
        }

        for(int m = left; m < right; m++)
        {
            if(i > mid)
            {
                array[m] = temp[j];
                j++;
            }
            else if(j > right)
            {
                array[m] = temp[i];
                i++;
            }
            else if(temp[j] < temp[i])
            {
                array[m] = temp[j];
                j++;
            }
            else
            {
                array[m] = temp[i];
                i++;
            }
        }
        return array;
    }
    */
    /*
    public void newMergeSort(int[] array, int[] temp, int left, int right)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            newMergeSort(array, temp, left, mid);
            newMergeSort(array, temp, mid + 1, right);
            newMerge(array, temp, left, mid, right);
        }

    }
    */
}