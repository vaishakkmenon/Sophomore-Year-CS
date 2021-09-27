package CS303.Lab6;

import java.util.ArrayList;

public class NovelSort 
{
    private static int[] nums = new int[4];

    private static int[] findSmallLarge(int[] A)
    {
        int smallest = A[0], largest = A[0], sIndex = 0, lIndex = 0;
        for(int i  = 0; i < A.length; i++)
        {
            if(A[i] < smallest)
            {
                smallest = A[i];
                sIndex = i;
            }
            else if(A[i] > largest)
            {
                largest = A[i];
                lIndex = i;
            }
        }
        
        nums[0] = smallest;
        nums[1] = largest;
        nums[2] = sIndex;
        nums[3] = lIndex;

        return nums;
    }

    public int[] sort(int[] A)
    {
        int length = A.length;
        int[] sorted = new int[length];
        int i = 0;
        int j = length - 1;

        while(length > 0)
        {
            findSmallLarge(A);

            //Assigning variable names to values so that values aren't hardcoded into the function
            int smallestNum = nums[0], largestNum = nums[1], sNumIndex = nums[2], lNumIndex = nums[3];
           
            sorted[i] = smallestNum;
            sorted[j] = largestNum;

            ArrayList<Integer> temp = new ArrayList<Integer>();

            for (int a = 0; a < length; a++) 
            {
                if (a == sNumIndex || a == lNumIndex) 
                {
                    continue;
                }
                temp.add(A[a]);
            }

            length -= 2;

            A = new int[length];
            for (int y = 0; y < temp.size(); y++) 
            {
                A[y] = temp.get(y);
            }

            i++;j--;
        }
        return sorted;
    }
}
