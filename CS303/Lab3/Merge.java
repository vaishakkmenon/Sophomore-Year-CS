/* Author: Vaishak Menon, Date: 09/07/2021*/
package CS303.Lab3;

public class Merge 
{
    public void mergeSort(int[] A, int[] temp, int p, int r, int min)
    {

        if(A.length <= min)
        {
            int i = 0;
            int key = 0;
            int length = A.length;
            for (int j = 1; j < length; j++)
            {
                key = A[j];
                i = j - 1;
                while(i >= 0 && A[i] > key)
                {
                    A[i + 1] = A[i];
                    i = i - 1;
                }
                A[i + 1] = key;
            }

        }
        else
        {
            int q;
            if(p < r)
            {
                q = (int) Math.floor((p + r) / 2);
                mergeSort(A,temp,p,q,min);
                mergeSort(A,temp,q+1,r,min);
                merge(A,temp,p,q,r);
            }
        }
    }

    public void merge(int[] A, int[] temp, int p, int q, int r)
    {
        int i, j;
        i = p;
        j = q + 1;

        for(int k = p; k <= r; k++)
        {
            temp[k] = A[k];
        }

        for(int k = p; k <= r; k++)
        {
            if(i > q)
            {
                A[k] = temp[k];
                j++;
            }
            else if(j > r)
            {
                A[k] = temp[i];
                i++;
            }
            else if(temp[j] < temp[i])
            {
                A[k] = temp[j];
                j++;
            }
            else
            {
                A[k] = temp[i];
                i++;
            }
        }
    }    
}
