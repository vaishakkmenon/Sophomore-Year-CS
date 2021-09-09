/* Author: Vaishak Menon, Date: 09/07/2021*/
package CS303.Lab3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MergeDriver 
{
    public static void main(String[] args)
    {
        File f1 = new File("input_100.txt");
        Merge mFun = new Merge();
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
        System.out.println("Enter smallest array size for insertion sort: ");
        int min = sc2.nextInt();
        sc2.close();

        long sTime_100 = System.nanoTime();
        mFun.mergeSort(array_100, tempArray,0, array_100.length-1, min);
        long eTime_100 = System.nanoTime() - sTime_100;
        System.out.println("Time taken to merge sort array of 100 numbers: " + eTime_100);
        
        
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

        long sTime_1000 = System.nanoTime();
        mFun.mergeSort(array_1000, tempArray,0, array_1000.length-1,min);
        long eTime_1000 = System.nanoTime() - sTime_1000;
        System.out.println("Time taken to merge sort array of 1000 numbers: " + eTime_1000);

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

        long sTime_5000 = System.nanoTime();
        mFun.mergeSort(array_5000, tempArray,0, array_5000.length-1,min);
        long eTime_5000 = System.nanoTime() - sTime_5000;
        System.out.println("Time taken to merge sort array of 5000 numbers: " + eTime_5000);

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

        long sTime_10000 = System.nanoTime();
        mFun.mergeSort(array_10000, tempArray,0, array_10000.length-1,min);
        long eTime_10000 = System.nanoTime() - sTime_10000;
        System.out.println("Time taken to merge sort array of 10000 numbers: " + eTime_10000);

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

        long sTime_50000 = System.nanoTime();
        mFun.mergeSort(array_50000, tempArray,0, array_50000.length-1,min);
        long eTime_50000 = System.nanoTime() - sTime_50000;
        System.out.println("Time taken to merge sort array of 50000 numbers: " + eTime_50000);

        File f6 = new File("input_100000.txt");
        int[] array_100000 = new int[]{};
        try
        {
            Scanner sc = new Scanner(f6);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_100000 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_100000[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        tempArray = new int[array_100000.length];
        for(int x = 0; x < array_100000.length; x++)
        {
            tempArray[x] = array_100000[x];
        }

        long sTime_100000 = System.nanoTime();
        mFun.mergeSort(array_100000, tempArray,0, array_100000.length-1,min);
        long eTime_100000 = System.nanoTime() - sTime_100000;
        System.out.println("Time taken to merge sort array of 100000 numbers: " + eTime_100000);

        File f7 = new File("input_500000.txt");
        int[] array_500000 = new int[]{};
        try
        {
            Scanner sc = new Scanner(f7);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_500000 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                array_500000[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        tempArray = new int[array_500000.length];
        for(int x = 0; x < array_500000.length; x++)
        {
            tempArray[x] = array_500000[x];
        }

        long sTime_500000 = System.nanoTime();
        mFun.mergeSort(array_500000, tempArray,0, array_500000.length-1,min);
        long eTime_500000 = System.nanoTime() - sTime_500000;
        System.out.println("Time taken to merge sort array of 500000 numbers: " + eTime_500000);
        
    }    
}
