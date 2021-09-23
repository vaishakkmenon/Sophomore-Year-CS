package CS303.Lab5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AllSortDriver 
{
    public static void main(String[] args)
    {
        File f1 = new File("input_100.txt");

        InsertionSort is = new InsertionSort();
        Merge ms = new Merge();
        HeapSort hp = new HeapSort();
        QuickSort qs = new QuickSort();
        QuicksortM qm = new QuicksortM();
        
        int[] iArray = new int[]{};
        int[] mArray = new int[]{};
        int[] hArray = new int[]{};
        int[] qsArray = new int[]{};
        int[] qmArray = new int[]{};

        try
        {
            Scanner sc = new Scanner(f1);
            String[] sArray = sc.nextLine().trim().split(" ");

            iArray = new int[sArray.length];
            mArray = new int[sArray.length];
            hArray = new int[sArray.length];
            qsArray = new int[sArray.length];
            qmArray = new int[sArray.length];

            int sLength = sArray.length;
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

        int[] tempArray = new int[mArray.length];
        for(int x = 0; x < mArray.length; x++)
        {
            tempArray[x] = mArray[x];
        }

        long iTime_100 = System.nanoTime();
        is.iSort(iArray);
        long eiTime_100 = System.nanoTime() - iTime_100;
        System.out.println("Time taken to insertion sort array of 100 numbers: " + eiTime_100);
        
        long mTime_100 = System.nanoTime();
        ms.mergeSort(mArray, tempArray, 0, mArray.length-1);
        long emTime_100 = System.nanoTime() - mTime_100;
        System.out.println("Time taken to merge sort array of 100 numbers: " + emTime_100);

        long hTime_100 = System.nanoTime();
        hp.sort(hArray);
        long ehTime_100 = System.nanoTime() - hTime_100;
        System.out.println("Time taken to heapsort array of 100 numbers: " + ehTime_100);

        long sTime_100 = System.nanoTime();
        qs.sort(qsArray, 0, qsArray.length-1);
        long eTime_100 = System.nanoTime() - sTime_100;
        System.out.println("Time taken to quick sort array of 100 numbers: " + eTime_100);

        long qmTime_100 = System.nanoTime();
        qm.sort(qmArray, 0, qmArray.length-1);
        long eqmTime_100 = System.nanoTime() - qmTime_100;
        System.out.println("Time taken to quick sort with median partition array of 100 numbers: " + eqmTime_100 + "\n");
        
        
        File f2 = new File("input_1000.txt");

        try
        {
            Scanner sc = new Scanner(f2);
            String[] sArray = sc.nextLine().trim().split(" ");
            
            iArray = new int[sArray.length];
            mArray = new int[sArray.length];
            hArray = new int[sArray.length];
            qsArray = new int[sArray.length];
            qmArray = new int[sArray.length];

            int sLength = sArray.length;
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

        long iTime_1000 = System.nanoTime();
        is.iSort(iArray);
        long eiTime_1000 = System.nanoTime() - iTime_1000;
        System.out.println("Time taken to insertion sort array of 1000 numbers: " + eiTime_1000);

        long mTime_1000 = System.nanoTime();
        ms.mergeSort(mArray, tempArray, 0, mArray.length-1);
        long emTime_1000 = System.nanoTime() - mTime_1000;
        System.out.println("Time taken to merge sort array of 1000 numbers: " + emTime_1000);

        long hTime_1000 = System.nanoTime();
        hp.sort(hArray);
        long ehTime_1000 = System.nanoTime() - hTime_1000;
        System.out.println("Time taken to heapsort array of 1000 numbers: " + ehTime_1000);

        long sTime_1000 = System.nanoTime();
        qs.sort(qsArray, 0, qsArray.length-1);
        long eTime_1000 = System.nanoTime() - sTime_1000;
        System.out.println("Time taken to quick sort array of 1000 numbers: " + eTime_1000);

        long qmTime_1000 = System.nanoTime();
        qm.sort(qmArray, 0, qmArray.length-1);
        long eqmTime_1000 = System.nanoTime() - qmTime_1000;
        System.out.println("Time taken to quick sort with median partition array of 1000 numbers: " + eqmTime_1000 + "\n");

        
        File f3 = new File("input_5000.txt");
        try
        {
            Scanner sc = new Scanner(f3);
            String[] sArray = sc.nextLine().trim().split(" ");

            iArray = new int[sArray.length];
            mArray = new int[sArray.length];
            hArray = new int[sArray.length];
            qsArray = new int[sArray.length];
            qmArray = new int[sArray.length];

            int sLength = sArray.length;
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

        long iTime_5000 = System.nanoTime();
        is.iSort(iArray);
        long eiTime_5000 = System.nanoTime() - iTime_5000;
        System.out.println("Time taken to insertion sort array of 5000 numbers: " + eiTime_5000);

        long mTime_5000 = System.nanoTime();
        ms.mergeSort(mArray, tempArray, 0, mArray.length-1);
        long emTime_5000 = System.nanoTime() - mTime_5000;
        System.out.println("Time taken to merge sort array of 5000 numbers: " + emTime_5000);

        long hTime_5000 = System.nanoTime();
        hp.sort(hArray);
        long ehTime_5000 = System.nanoTime() - hTime_5000;
        System.out.println("Time taken to heapsort array of 5000 numbers: " + ehTime_5000);

        long sTime_5000 = System.nanoTime();
        qs.sort(qsArray, 0, qsArray.length-1);
        long eTime_5000 = System.nanoTime() - sTime_5000;
        System.out.println("Time taken to quick sort array of 5000 numbers: " + eTime_5000);

        long qmTime_5000 = System.nanoTime();
        qm.sort(qmArray, 0, qmArray.length-1);
        long eqmTime_5000 = System.nanoTime() - qmTime_5000;
        System.out.println("Time taken to quick sort with median partition array of 5000 numbers: " + eqmTime_5000 + "\n");

        
        File f4 = new File("input_10000.txt");
        try
        {
            Scanner sc = new Scanner(f4);
            String[] sArray = sc.nextLine().trim().split(" ");

            iArray = new int[sArray.length];
            mArray = new int[sArray.length];
            hArray = new int[sArray.length];
            qsArray = new int[sArray.length];
            qmArray = new int[sArray.length];

            int sLength = sArray.length;
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

        long iTime_10000 = System.nanoTime();
        is.iSort(iArray);
        long eiTime_10000 = System.nanoTime() - iTime_10000;
        System.out.println("Time taken to insertion sort array of 10000 numbers: " + eiTime_10000);

        long mTime_10000 = System.nanoTime();
        ms.mergeSort(mArray, tempArray, 0, mArray.length-1);
        long emTime_10000 = System.nanoTime() - mTime_10000;
        System.out.println("Time taken to merge sort array of 10000 numbers: " + emTime_10000);

        long hTime_10000 = System.nanoTime();
        hp.sort(hArray);
        long ehTime_10000 = System.nanoTime() - hTime_10000;
        System.out.println("Time taken to heapsort array of 10000 numbers: " + ehTime_10000);

        long sTime_10000 = System.nanoTime();
        qs.sort(qsArray, 0, qsArray.length-1);
        long eTime_10000 = System.nanoTime() - sTime_10000;
        System.out.println("Time taken to quick sort array of 10000 numbers: " + eTime_10000);

        long qmTime_10000 = System.nanoTime();
        qm.sort(qmArray, 0, qmArray.length-1);
        long eqmTime_10000 = System.nanoTime() - qmTime_10000;
        System.out.println("Time taken to quick sort with median partition array of 10000 numbers: " + eqmTime_10000 + "\n");

        
        File f5 = new File("input_50000.txt");
        try
        {
            Scanner sc = new Scanner(f5);
            String[] sArray = sc.nextLine().trim().split(" ");

            iArray = new int[sArray.length];
            mArray = new int[sArray.length];
            hArray = new int[sArray.length];
            qsArray = new int[sArray.length];
            qmArray = new int[sArray.length];

            int sLength = sArray.length;
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

        long iTime_50000 = System.nanoTime();
        is.iSort(iArray);
        long eiTime_50000 = System.nanoTime() - iTime_50000;
        System.out.println("Time taken to insertion sort array of 50000 numbers: " + eiTime_50000);

        long mTime_50000 = System.nanoTime();
        ms.mergeSort(mArray, tempArray, 0, mArray.length-1);
        long emTime_50000 = System.nanoTime() - mTime_50000;
        System.out.println("Time taken to merge sort array of 50000 numbers: " + emTime_50000);

        long hTime_50000 = System.nanoTime();
        hp.sort(hArray);
        long ehTime_50000 = System.nanoTime() - hTime_50000;
        System.out.println("Time taken to heapsort array of 50000 numbers: " + ehTime_50000);

        long sTime_50000 = System.nanoTime();
        qs.sort(qsArray, 0, qsArray.length-1);
        long eTime_50000 = System.nanoTime() - sTime_50000;
        System.out.println("Time taken to quick sort array of 50000 numbers: " + eTime_50000);

        long qmTime_50000 = System.nanoTime();
        qm.sort(qmArray, 0, qmArray.length-1);
        long eqmTime_50000 = System.nanoTime() - qmTime_50000;
        System.out.println("Time taken to quick sort with median partition array of 50000 numbers: " + eqmTime_50000 + "\n");

        File f6 = new File("input_100000.txt");
        try
        {
            Scanner sc = new Scanner(f6);
            String[] sArray = sc.nextLine().trim().split(" ");

            iArray = new int[sArray.length];
            mArray = new int[sArray.length];
            hArray = new int[sArray.length];
            qsArray = new int[sArray.length];
            qmArray = new int[sArray.length];

            int sLength = sArray.length;
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

        long iTime_100000 = System.nanoTime();
        is.iSort(iArray);
        long eiTime_100000 = System.nanoTime() - iTime_100000;
        System.out.println("Time taken to insertion sort array of 100000 numbers: " + eiTime_100000);

        long mTime_100000 = System.nanoTime();
        ms.mergeSort(mArray, tempArray, 0, mArray.length-1);
        long emTime_100000 = System.nanoTime() - mTime_100000;
        System.out.println("Time taken to merge sort array of 100000 numbers: " + emTime_100000);

        long hTime_100000 = System.nanoTime();
        hp.sort(hArray);
        long ehTime_100000 = System.nanoTime() - hTime_100000;
        System.out.println("Time taken to heapsort array of 100000 numbers: " + ehTime_100000);

        long sTime_100000 = System.nanoTime();
        qs.sort(qsArray, 0, qsArray.length-1);
        long eTime_100000 = System.nanoTime() - sTime_100000;
        System.out.println("Time taken to quick sort array of 100000 numbers: " + eTime_100000);

        long qmTime_100000 = System.nanoTime();
        qm.sort(qmArray, 0, qmArray.length-1);
        long eqmTime_100000 = System.nanoTime() - qmTime_100000;
        System.out.println("Time taken to quick sort with median partition array of 100000 numbers: " + eqmTime_100000 + "\n");

        File f7 = new File("input_500000.txt");
        try
        {
            Scanner sc = new Scanner(f7);
            String[] sArray = sc.nextLine().trim().split(" ");

            iArray = new int[sArray.length];
            mArray = new int[sArray.length];
            hArray = new int[sArray.length];
            qsArray = new int[sArray.length];
            qmArray = new int[sArray.length];

            int sLength = sArray.length;
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

        long iTime_500000 = System.nanoTime();
        is.iSort(iArray);
        long eiTime_500000 = System.nanoTime() - iTime_500000;
        System.out.println("Time taken to insertion sort array of 500000 numbers: " + eiTime_500000);

        long mTime_500000 = System.nanoTime();
        ms.mergeSort(mArray, tempArray, 0, mArray.length-1);
        long emTime_500000 = System.nanoTime() - mTime_500000;
        System.out.println("Time taken to merge sort array of 500000 numbers: " + emTime_500000);

        long hTime_500000 = System.nanoTime();
        hp.sort(hArray);
        long ehTime_500000 = System.nanoTime() - hTime_500000;
        System.out.println("Time taken to heapsort array of 500000 numbers: " + ehTime_500000);

        long sTime_500000 = System.nanoTime();
        qs.sort(qsArray, 0, qsArray.length-1);
        long eTime_500000 = System.nanoTime() - sTime_500000;
        System.out.println("Time taken to quick sort array of 500000 numbers: " + eTime_500000);

        long qmTime_500000 = System.nanoTime();
        qm.sort(qmArray, 0, qmArray.length-1);
        long eqmTime_500000 = System.nanoTime() - qmTime_500000;
        System.out.println("Time taken to quick sort with median partition array of 500000 numbers: " + eqmTime_500000 + "\n");
        
    }
}

