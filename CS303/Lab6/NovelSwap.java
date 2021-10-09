package CS303.Lab6;

public class NovelSwap {
    private static int[] nums = new int[2];

    private int[] findSmallLarge(int[] A, int a, int b) 
    {
        int smallest = A[a], largest = A[b], sIndex = a, lIndex = b;

        for (int i = a; i < b; i++) 
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
        int i = 0, j = A.length;

        while (j - i > 0) 
        {
            findSmallLarge(A, i, j-1);

            int sIndex = nums[0];
            int lIndex = nums[1];

            if(i == lIndex)
            {
                swap(A, j-1, lIndex);
                swap(A, i, sIndex);
            }
            else
            {
                swap(A, i, sIndex);
                swap(A, j-1, lIndex);
            }
            
            i++;
            j--;
        }

        if (A.length % 2 == 0 & i == A.length / 2) 
        {
            int a = 0;
            int key = A[A.length / 2];
            int length = A.length;
            
            for (int k = 1; k < length; k++) 
            {
                key = A[k];
                a = k - 1;
                while (a >= 0 && A[a] > key) 
                {
                    A[a + 1] = A[a];
                    a--;
                }
                A[a + 1] = key;
            }
        }
    }
}
