package CS303.Lab3;

public class MergeFunctions
{

    //Original merge function, need to ask about difference
    public int[] merge(int[] array,int left,int mid,int right)
    {
        int size1 = mid - left + 1;
        int size2 = right - mid;

        int[] temp1 = new int[size1];
        int[] temp2 = new int[size2];

        for(int i = 0; i < temp1.length; i++)
        {
            temp1[i] = array[left + i - 1];
        }

        for(int j = 0; j < temp2.length; j++)
        {
            temp2[j] = array[mid + j];
        }

        int k = 0;
        int m = 0;

        for(int n = left; n < right; n++)
        {
            if(temp1[k] <= temp2[m])
            {
                array[n] = temp1[k];
                k++;
            }
            else
            {
                array[n] = temp2[m];
                m++;
            }
        }
        return array;
    }

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

    //Original mergeSort
    public int[] mergeSort(int[] array, int left, int right)
    {
        if(left < right)
        {
            int mid = (left + right)/2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }

        return array;
    }

    public int[] newMergeSort(int[] array, int[] temp, int left, int right)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            newMergeSort(array, temp, left, mid);
            newMergeSort(array, temp, mid + 1, right);
            newMerge(array, temp, left, mid, right);
        }

        return array;
    }
}