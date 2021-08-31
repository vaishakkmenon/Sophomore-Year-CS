package CS303.Lab2;

public class insertionSort
{
    public int[] iSort(int[] array)
    {
        int i = 0;
        int key = 0;
        for (int j = 1; j < array.length; j++)
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