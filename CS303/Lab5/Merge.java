/* Author: Vaishak Menon, Date: 09/22/2021 */
package CS303.Lab5;

public class Merge 
{
    public void mergeSort(int[] A, int[] temp, int p, int r)
    {
        int q;
        if(p < r)
        {
            q = (int) Math.floor((p + r) / 2);
            mergeSort(A,temp,p,q);
            mergeSort(A,temp,q+1,r);
            merge(A,temp,p,q,r);
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
