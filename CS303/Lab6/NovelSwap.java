package CS303.Lab6;

public class NovelSwap {
    private static int[] nums = new int[2];

    private int[] findSmallLarge(int[] A, int a, int b) 
    {
        int smallest = A[a], largest = A[b], sIndex = a, lIndex = b;

        for (int i = a; i < b+1; i++) 
        {
            if (A[i] <= smallest) 
            {
                smallest = A[i];
                sIndex = i;
            } 
            if (A[i] >= largest) 
            {
                largest = A[i];
                lIndex = i;
            }
        }

        nums[0] = sIndex;
        nums[1] = lIndex;

        return nums;
    }

    private void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }

    public void sort(int[] A) 
    {
        int i = 0, j = A.length-1;

        while (j - i > 0) 
        {
            findSmallLarge(A, i, j);

            int sIndex = nums[0];
            int lIndex = nums[1];

            if(i == lIndex && j == sIndex)
            {
                swap(A, i, sIndex);
            }
            else if(i == lIndex)
            {
                swap(A, j, lIndex);
                swap(A, i, sIndex);
            }
            else if(j == sIndex)
            {
                swap(A, i, sIndex);
                i--;
                j++;
            }
            else
            {
                swap(A, i, sIndex);
                swap(A, j, lIndex);
            }
            
            i++;
            j--;

        }
    }
}
