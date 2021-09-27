/* Author: Vaishak Menon, Date: 09/22/21 */

package CS303.Lab5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AllSortDriver 
{
    private static int[] iArray = new int[]{};
    private static int[] mArray = new int[]{};
    private static int[] hArray = new int[]{};
    private static int[] qsArray = new int[]{};
    private static int[] qmArray = new int[]{};
    private static int[] tempArray = new int[]{};

    private static InsertionSort is = new InsertionSort();
    private static Merge ms = new Merge();
    private static HeapSort hp = new HeapSort();
    private static QuickSort qs = new QuickSort();
    private static QuicksortM qm = new QuicksortM();

    public static int updateArray(File f)
    {
        try
        {
            Scanner sc = new Scanner(f);
            String[] sArray = sc.nextLine().trim().split(" ");
            int sLength = sArray.length;

            iArray = new int[sLength];
            mArray = new int[sLength];
            hArray = new int[sLength];
            qsArray = new int[sLength];
            qmArray = new int[sLength];

            for(int i = 0; i < sLength; i++)
            {
                iArray[i] = Integer.parseInt(sArray[i]);
                mArray[i] = Integer.parseInt(sArray[i]);
                hArray[i] = Integer.parseInt(sArray[i]);
                qsArray[i] = Integer.parseInt(sArray[i]);
                qmArray[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        tempArray = new int[mArray.length];
        for(int x = 0; x < mArray.length; x++)
        {
            tempArray[x] = mArray[x];
        }

        return tempArray.length;
    }

    public static void getTimes(int size)
    {
        long iTime = System.nanoTime();
        is.iSort(iArray);
        long eiTime = System.nanoTime() - iTime;
        System.out.println("Time taken to insertion sort array of " + size + " numbers: " + eiTime);
        
        long mTime = System.nanoTime();
        ms.mergeSort(mArray, tempArray, 0, mArray.length-1);
        long emTime = System.nanoTime() - mTime;
        System.out.println("Time taken to merge sort array of " + size + " numbers: " + emTime);

        long hTime = System.nanoTime();
        hp.sort(hArray);
        long ehTime = System.nanoTime() - hTime;
        System.out.println("Time taken to heapsort array of " + size + " numbers: " + ehTime);

        long sTime = System.nanoTime();
        qs.sort(qsArray, 0, qsArray.length-1);
        long eTime = System.nanoTime() - sTime;
        System.out.println("Time taken to quick sort array of " + size + " numbers: " + eTime);

        long qmTime = System.nanoTime();
        qm.sort(qmArray, 0, qmArray.length-1);
        long eqmTime = System.nanoTime() - qmTime;
        System.out.println("Time taken to quick sort with median partition array of " + size + " numbers: " + eqmTime + "\n");
    }
    public static void main(String[] args)
    {
        int size;

        File f1 = new File("input_100.txt");
        size = updateArray(f1);
        getTimes(size);
        
        File f2 = new File("input_1000.txt");
        size = updateArray(f2);
        getTimes(size);

        File f3 = new File("input_5000.txt");
        size = updateArray(f3);
        getTimes(size);
        
        File f4 = new File("input_10000.txt");
        size = updateArray(f4);
        getTimes(size);

        File f5 = new File("input_50000.txt");
        size = updateArray(f5);
        getTimes(size);

        File f6 = new File("input_100000.txt");
        size = updateArray(f6);
        getTimes(size);

        File f7 = new File("input_500000.txt");
        size = updateArray(f7);
        getTimes(size);
    }
}