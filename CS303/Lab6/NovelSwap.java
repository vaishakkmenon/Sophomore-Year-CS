package CS303.Lab6;

public class NovelSwap {
    private static int[] nums = new int[4];

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
            else if (A[i] >= largest) 
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

    private void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }

    public void sort(int[] A) 
    {
        int i = 0, j = A.length;

        while (j - i >= 0) 
        {
            if(A.length % 2 == 0 & i == A.length / 2)
            {
                int a = 0;
                int key = A[A.length/2];
                int length = A.length;
                for (int k = 1; k < length; k++)
                {
                    key = A[k];
                    a = k - 1;
                    while(a >= 0 && A[a] > key)
                    {
                        A[a + 1] = A[a];
                        a--;
                    }
                    A[a + 1] = key;
                }
            }
            findSmallLarge(A, i, j-1);
            
            int sIndex = nums[2];
            int lIndex = nums[3];

            swap(A, i, sIndex);
            swap(A, j-1, lIndex);

            i++;
            j--;
        }

    }
}
