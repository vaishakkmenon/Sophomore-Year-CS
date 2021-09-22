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
        int[] array_100 = new int[]{};
        int[] array_100_2 = new int[]{};

        try
        {
            Scanner sc = new Scanner(f1);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_100 = new int[sArray.length];
            array_100_2 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_100[i] = Integer.parseInt(sArray[i]);
                array_100_2[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        int[] tempArray = new int[array_100.length];
        for(int x = 0; x < array_100.length; x++)
        {
            tempArray[x] = array_100[x];
        }

        long iTime_100 = System.nanoTime();
        is.iSort(array_100);
        long eiTime_100 = System.nanoTime() - iTime_100;
        System.out.println("Time taken to insertion sort array of 100 numbers: " + eiTime_100);

        long mTime_100 = System.nanoTime();
        ms.mergeSort(array_100, tempArray, 0, array_100.length-1);
        long emTime_100 = System.nanoTime() - mTime_100;
        System.out.println("Time taken to merge sort array of 100 numbers: " + emTime_100);

        long hTime_100 = System.nanoTime();
        hp.sort(array_100);
        long ehTime_100 = System.nanoTime() - hTime_100;
        System.out.println("Time taken to heapsort array of 100 numbers: " + ehTime_100);

        long sTime_100 = System.nanoTime();
        qs.sort(array_100, 0, array_100.length-1);
        long eTime_100 = System.nanoTime() - sTime_100;
        System.out.println("Time taken to quick sort array of 100 numbers: " + eTime_100);

        long qmTime_100 = System.nanoTime();
        qm.sort(array_100_2, 0, array_100_2.length-1);
        long eqmTime_100 = System.nanoTime() - qmTime_100;
        System.out.println("Time taken to quick sort with median partition array of 100 numbers: " + eqmTime_100 + "\n");
        
        
        File f2 = new File("input_1000.txt");
        int[] array_1000 = new int[]{};
        int[] array_1000_2 = new int[]{};

        try
        {
            Scanner sc = new Scanner(f2);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_1000 = new int[sArray.length];
            array_1000_2 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_1000[i] = Integer.parseInt(sArray[i]);
                array_1000_2[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        int[] tempArray2 = new int[array_1000.length];
        for(int x = 0; x < array_1000.length; x++)
        {
            tempArray[x] = array_1000[x];
        }

        long iTime_1000 = System.nanoTime();
        is.iSort(array_1000);
        long eiTime_1000 = System.nanoTime() - iTime_1000;
        System.out.println("Time taken to insertion sort array of 1000 numbers: " + eiTime_1000);

        long mTime_1000 = System.nanoTime();
        ms.mergeSort(array_1000, tempArray2, 0, array_1000.length-1);
        long emTime_1000 = System.nanoTime() - mTime_1000;
        System.out.println("Time taken to merge sort array of 1000 numbers: " + emTime_1000);

        long hTime_1000 = System.nanoTime();
        hp.sort(array_1000);
        long ehTime_1000 = System.nanoTime() - hTime_1000;
        System.out.println("Time taken to heapsort array of 1000 numbers: " + ehTime_1000);

        long sTime_1000 = System.nanoTime();
        qs.sort(array_1000, 0, array_1000.length-1);
        long eTime_1000 = System.nanoTime() - sTime_1000;
        System.out.println("Time taken to quick sort array of 1000 numbers: " + eTime_1000);

        long qmTime_1000 = System.nanoTime();
        qm.sort(array_1000_2, 0, array_1000_2.length-1);
        long eqmTime_1000 = System.nanoTime() - qmTime_1000;
        System.out.println("Time taken to quick sort with median partition array of 1000 numbers: " + eqmTime_1000 + "\n");

        File f3 = new File("input_5000.txt");
        int[] array_5000 = new int[]{};
        int[] array_5000_2 = new int[]{};

        try
        {
            Scanner sc = new Scanner(f3);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_5000 = new int[sArray.length];
            array_5000_2 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_5000[i] = Integer.parseInt(sArray[i]);
                array_5000_2[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        long sTime_5000 = System.nanoTime();
        qs.sort(array_5000, 0, array_5000.length-1);
        long eTime_5000 = System.nanoTime() - sTime_5000;
        System.out.println("Time taken to quick sort array of 5000 numbers: " + eTime_5000);

        long mTime_5000 = System.nanoTime();
        qm.sort(array_5000_2, 0, array_5000_2.length-1);
        long emTime_5000 = System.nanoTime() - mTime_5000;
        System.out.println("Time taken to quick sort with median partition array of 5000 numbers: " + emTime_5000);

        File f4 = new File("input_10000.txt");
        int[] array_10000 = new int[]{};
        int[] array_10000_2 = new int[]{};

        try
        {
            Scanner sc = new Scanner(f4);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_10000 = new int[sArray.length];
            array_10000_2 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_10000[i] = Integer.parseInt(sArray[i]);
                array_10000_2[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        long sTime_10000 = System.nanoTime();
        qs.sort(array_10000, 0, array_10000.length-1);
        long eTime_10000 = System.nanoTime() - sTime_10000;
        System.out.println("Time taken to quick sort array of 10000 numbers: " + eTime_10000);

        long mTime_10000 = System.nanoTime();
        qm.sort(array_10000_2, 0, array_10000_2.length-1);
        long emTime_10000 = System.nanoTime() - mTime_10000;
        System.out.println("Time taken to quick sort with median partition array of 10000 numbers: " + emTime_10000);

        File f5 = new File("input_50000.txt");
        int[] array_50000 = new int[]{};
        int[] array_50000_2 = new int[]{};

        try
        {
            Scanner sc = new Scanner(f5);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_50000 = new int[sArray.length];
            array_50000_2 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_50000[i] = Integer.parseInt(sArray[i]);
                array_50000_2[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        long sTime_50000 = System.nanoTime();
        qs.sort(array_50000, 0, array_50000.length-1);
        long eTime_50000 = System.nanoTime() - sTime_50000;
        System.out.println("Time taken to quick sort array of 50000 numbers: " + eTime_50000);

        long mTime_50000 = System.nanoTime();
        qm.sort(array_50000_2, 0, array_50000_2.length-1);
        long emTime_50000 = System.nanoTime() - mTime_50000;
        System.out.println("Time taken to quick sort with median partition array of 50000 numbers: " + emTime_50000);

        File f6 = new File("input_100000.txt");
        int[] array_100000 = new int[]{};
        int[] array_100000_2 = new int[]{};

        try
        {
            Scanner sc = new Scanner(f6);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_100000 = new int[sArray.length];
            array_100000_2 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_100000[i] = Integer.parseInt(sArray[i]);
                array_100000_2[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        long sTime_100000 = System.nanoTime();
        qs.sort(array_100000, 0, array_100000.length-1);
        long eTime_100000 = System.nanoTime() - sTime_100000;
        System.out.println("Time taken to quick sort array of 100000 numbers: " + eTime_100000);

        long mTime_100000 = System.nanoTime();
        qm.sort(array_100000_2, 0, array_100000_2.length-1);
        long emTime_100000 = System.nanoTime() - mTime_100000;
        System.out.println("Time taken to quick sort with median partition array of 100000 numbers: " + emTime_100000);

        File f7 = new File("input_500000.txt");
        int[] array_500000 = new int[]{};
        int[] array_500000_2 = new int[]{};

        try
        {
            Scanner sc = new Scanner(f7);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_500000 = new int[sArray.length];
            array_500000_2 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_500000[i] = Integer.parseInt(sArray[i]);
                array_500000_2[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        long sTime_500000 = System.nanoTime();
        qs.sort(array_500000, 0, array_500000.length-1);
        long eTime_500000 = System.nanoTime() - sTime_500000;
        System.out.println("Time taken to quick sort array of 500000 numbers: " + eTime_500000);

        long mTime_500000 = System.nanoTime();
        qm.sort(array_500000_2, 0, array_500000_2.length-1);
        long emTime_500000 = System.nanoTime() - mTime_500000;
        System.out.println("Time taken to quick sort with median partition array of 500000 numbers: " + emTime_500000);
        
    }
}

