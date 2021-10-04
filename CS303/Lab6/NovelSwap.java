package CS303.Lab6;

public class NovelSwap 
{
    private static int[] nums = new int[4];

    private int[] findSmallLarge(int[] A)
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

    private void swap(int[] A, int x, int y)
    {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }

    public void sort(int[] A)
    {
        int i = 0, j = A.length - 1;
        while((j-i) > 0)
        {
            findSmallLarge(A);

            int sIndex = nums[2];
            int lIndex = nums[3];
            
            System.out.println("Sindex: " + sIndex + " Lindex: " + lIndex);

            swap(A,i,sIndex);
            swap(A,j,lIndex);
            
            i++; j--;
        }
        

    }
}
