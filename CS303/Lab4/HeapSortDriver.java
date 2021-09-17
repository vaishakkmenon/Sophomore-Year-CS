/*Author: Vaishak Menon, Date: 09/17/21*/

package CS303.Lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HeapSortDriver 
{
    public static void main(String[] args)
    {
        HeapSort hp = new HeapSort();
        insertionSort is = new insertionSort();
        Merge ms = new Merge();

        File f1 = new File("input_100.txt");
        int[] array_100 = new int[]{};

        try
        {
            Scanner sc = new Scanner(f1);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_100 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_100[i] = Integer.parseInt(sArray[i]);
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

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter smallest array size for insertion sort within merge sort: ");
        int min = sc2.nextInt();
        sc2.close();

        long lTime_100 = System.nanoTime();
        is.iSort(array_100);
        long elTime_100 = System.nanoTime() - lTime_100;
        System.out.println("Time taken to insertion sort array of 100 numbers: " + elTime_100);

        long mTime_100 = System.nanoTime();
        ms.mergeSort(array_100, tempArray,0, array_100.length-1, min);
        long emTime_100 = System.nanoTime() - mTime_100;
        System.out.println("Time taken to merge sort array of 100 numbers: " + emTime_100);

        long sTime_100 = System.nanoTime();
        hp.sort(array_100);
        long eTime_100 = System.nanoTime() - sTime_100;
        System.out.println("Time taken to heapsort array of 100 numbers: " + eTime_100 + "\n");

        File f2 = new File("input_1000.txt");
        int[] array_1000 = new int[]{};
        try
        {
            Scanner sc = new Scanner(f2);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_1000 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_1000[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        tempArray = new int[array_1000.length];
        for(int x = 0; x < array_1000.length; x++)
        {
            tempArray[x] = array_1000[x];
        }

        long lTime_1000 = System.nanoTime();
        is.iSort(array_1000);
        long elTime_1000 = System.nanoTime() - lTime_1000;
        System.out.println("Time taken to insertion sort array of 1000 numbers: " + elTime_1000);

        long mTime_1000 = System.nanoTime();
        ms.mergeSort(array_1000, tempArray,0, array_1000.length-1, min);
        long emTime_1000 = System.nanoTime() - mTime_1000;
        System.out.println("Time taken to merge sort array of 1000 numbers: " + emTime_1000);

        long sTime_1000 = System.nanoTime();
        hp.sort(array_1000);
        long eTime_1000 = System.nanoTime() - sTime_1000;
        System.out.println("Time taken to heapsort array of 1000 numbers: " + eTime_1000 + "\n");

        File f3 = new File("input_5000.txt");
        int[] array_5000 = new int[]{};
        try
        {
            Scanner sc = new Scanner(f3);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_5000 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_5000[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        tempArray = new int[array_5000.length];
        for(int x = 0; x < array_5000.length; x++)
        {
            tempArray[x] = array_5000[x];
        }

        long lTime_5000 = System.nanoTime();
        is.iSort(array_5000);
        long elTime_5000 = System.nanoTime() - lTime_5000;
        System.out.println("Time taken to insertion sort array of 5000 numbers: " + elTime_5000);

        long mTime_5000 = System.nanoTime();
        ms.mergeSort(array_5000, tempArray,0, array_5000.length-1, min);
        long emTime_5000 = System.nanoTime() - mTime_5000;
        System.out.println("Time taken to merge sort array of 5000 numbers: " + emTime_5000);

        long sTime_5000 = System.nanoTime();
        hp.sort(array_5000);
        long eTime_5000 = System.nanoTime() - sTime_5000;
        System.out.println("Time taken to heapsort array of 5000 numbers: " + eTime_5000 + "\n");

        File f4 = new File("input_10000.txt");
        int[] array_10000 = new int[]{};
        try
        {
            Scanner sc = new Scanner(f4);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_10000 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_10000[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        tempArray = new int[array_10000.length];
        for(int x = 0; x < array_10000.length; x++)
        {
            tempArray[x] = array_10000[x];
        }

        long lTime_10000 = System.nanoTime();
        is.iSort(array_10000);
        long elTime_10000 = System.nanoTime() - lTime_10000;
        System.out.println("Time taken to insertion sort array of 10000 numbers: " + elTime_10000);

        long mTime_10000 = System.nanoTime();
        ms.mergeSort(array_10000, tempArray,0, array_10000.length-1, min);
        long emTime_10000 = System.nanoTime() - mTime_10000;
        System.out.println("Time taken to merge sort array of 10000 numbers: " + emTime_10000);

        long sTime_10000 = System.nanoTime();
        hp.sort(array_10000);
        long eTime_10000 = System.nanoTime() - sTime_10000;
        System.out.println("Time taken to heapsort array of 10000 numbers: " + eTime_10000 + "\n");

        File f5 = new File("input_50000.txt");
        int[] array_50000 = new int[]{};
        try
        {
            Scanner sc = new Scanner(f5);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_50000 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_50000[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        tempArray = new int[array_50000.length];
        for(int x = 0; x < array_50000.length; x++)
        {
            tempArray[x] = array_50000[x];
        }

        long lTime_50000 = System.nanoTime();
        is.iSort(array_50000);
        long elTime_50000 = System.nanoTime() - lTime_50000;
        System.out.println("Time taken to insertion sort array of 50000 numbers: " + elTime_50000);

        long mTime_50000 = System.nanoTime();
        ms.mergeSort(array_50000, tempArray,0, array_50000.length-1, min);
        long emTime_50000 = System.nanoTime() - mTime_50000;
        System.out.println("Time taken to merge sort array of 50000 numbers: " + emTime_50000);

        long sTime_50000 = System.nanoTime();
        hp.sort(array_50000);
        long eTime_50000 = System.nanoTime() - sTime_50000;
        System.out.println("Time taken to heapsort array of 50000 numbers: " + eTime_50000 + "\n");
    }
}
