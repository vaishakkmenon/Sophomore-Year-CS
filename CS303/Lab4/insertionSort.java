/* Author: Vaishak Menon, Date: 09/17/2021*/
package CS303.Lab4;

public class insertionSort
{
    public int[] iSort(int[] array)
    {
        int i = 0;
        int key = 0;
        int length = array.length;
        for (int j = 1; j < length; j++)
        {
            key = array[j];
            i = j - 1;
            while(i >= 0 && array[i] > key)
            {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }

        return array;
    }
}