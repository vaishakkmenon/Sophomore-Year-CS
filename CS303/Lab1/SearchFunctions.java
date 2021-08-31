package CS303.Lab1;

public class SearchFunctions
{
    public int linearSearch(int input, int[] array)
    {
        int index = 0;
        for (int x = 0; x < array.length; x++)
        {
            if(input == array[x])
            {
                index = x;
                return index;
            }
        }
        return -1;
    }

    public int binarySearch(int input, int[] array, int left, int right)
    {
        int mid = (left + right)/2;

        //System.out.println(mid);

        if(mid == right || mid == left)
        {
            return -1;
        }
        
        if(input == array[mid])
        {
            return mid;
        }
        else if(input == array[left])
        {
            return left;
        }
        else if(input == array[right])
        {
            return right;
        }

        if(input < array[mid])
        {
            return binarySearch(input, array, left, mid-1);
        }

        if(input > array[mid])
        {
            return binarySearch(input, array, mid, right);
        }

        return -1;
    }
}
