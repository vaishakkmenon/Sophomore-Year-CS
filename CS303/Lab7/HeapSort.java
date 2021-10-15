/* Author: Vaishak Menon, Date: 10/15/21 */
package CS303.Lab7;

public class HeapSort 
{
	public void sort(int[] A)
	{
		int size = A.length;
        buildMaxHeap(A, size);
		for (int i = size - 1; i > 0; i--) 
        {
			int temp = A[0];
			A[0] = A[i];
			A[i] = temp;

			maxHeapify(A, i, 0);
		}
	}

    public void buildMaxHeap(int[] A, int size)
    {
        for (int i = size / 2 - 1; i >= 0; i--)
        {
            maxHeapify(A, size, i);
        }
    }

	public void maxHeapify(int arr[], int n, int i)
	{
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && arr[l] < arr[largest])
        {
            largest = l;
        }
			
		if (r < n && arr[r] < arr[largest])
        {
            largest = r;
        }

		if (largest != i) 
        {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			maxHeapify(arr, n, largest);
		}
	}
}
