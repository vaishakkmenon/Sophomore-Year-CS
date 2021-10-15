/* Author: Vaishak Menon, Date: 09/22/2021 */
package CS303.Lab7;


public class InsertionSort
{
    public void iSort(int[] array)
    {
        int i = 0;
        int key = 0;
        int length = array.length;
        for (int j = 1; j < length; j++)
        {
            key = array[j];
            i = j - 1;
            while(i >= 0 && array[i] < key)
            {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }

    }
}