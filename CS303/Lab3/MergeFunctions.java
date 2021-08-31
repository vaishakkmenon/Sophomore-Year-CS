package CS303.Lab3;

public class MergeFunctions
{
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

}