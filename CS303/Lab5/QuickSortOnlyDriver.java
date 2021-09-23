package CS303.Lab5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class QuickSortOnlyDriver 
{
    private static QuickSort qs = new QuickSort();
    private static QuicksortM qm = new QuicksortM();

    private static int[] qsArray = new int[]{};
    private static int[] qmArray = new int[]{};

    private static int updateArray(File f)
    {
        try
        {
            Scanner sc = new Scanner(f);
            String[] sArray = sc.nextLine().trim().split(" ");
            qsArray = new int[sArray.length];
            qmArray = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                qsArray[i] = Integer.parseInt(sArray[i]);
                qmArray[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        return qsArray.length;
    }

    private static void getTimes(int size)
    {
        long sTime = System.nanoTime();
        qs.sort(qsArray, 0, qsArray.length-1);
        long eTime = System.nanoTime() - sTime;
        System.out.println("Time taken to quick sort array of " + size + " numbers: " + eTime);

        long mTime = System.nanoTime();
        qm.sort(qmArray, 0, qmArray.length-1);
        long emTime = System.nanoTime() - mTime;
        System.out.println("Time taken to quick sort with median partition array of " + size + " numbers: " + emTime + "\n");
    }
    public static void main(String[] args)
    {
        File f = new File("Input_Random.txt");
        File f2 = new File("Input_ReversedSorted.txt");
        File f3 = new File("Input_Sorted.txt");

        int[] random = new int[]{};
        int[] reversed = new int[]{};
        int[] sorted = new int[]{};
        
        try
        {
            Scanner sc = new Scanner(f);
            String[] sArray = sc.nextLine().trim().split(" ");
            random = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                random[i] = Integer.valueOf(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        try
        {
            Scanner sc = new Scanner(f2);
            String[] sArray = sc.nextLine().trim().split(" ");
            reversed = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                reversed[i] = Integer.valueOf(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        try
        {
            Scanner sc = new Scanner(f3);
            String[] sArray = sc.nextLine().trim().split(" ");
            sorted = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                sorted[i] = Integer.valueOf(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        long rdTime = System.nanoTime();
        qs.sort(random, 0, random.length-1);
        long erdTime = System.nanoTime() - rdTime;
        System.out.println("Time taken to quick sort array of random numbers: " + erdTime);

        long rsTime = System.nanoTime();
        qs.sort(reversed, 0, reversed.length-1);
        long ersTime = System.nanoTime() - rsTime;
        System.out.println("Time taken to quick sort array of reversed sorted numbers: " + ersTime);

        long sTime = System.nanoTime();
        qs.sort(sorted, 0, sorted.length-1);
        long esTime = System.nanoTime() - sTime;
        System.out.println("Time taken to quick sort array of sorted numbers: " + esTime + "\n");

        int size;

        File f4 = new File("input_100.txt");
        size = updateArray(f4);
        getTimes(size);
        
        File f5 = new File("input_1000.txt");
        size = updateArray(f5);
        getTimes(size);

        File f6 = new File("input_5000.txt");
        size = updateArray(f6);
        getTimes(size);

        File f7 = new File("input_10000.txt");
        size = updateArray(f7);
        getTimes(size);

        File f8 = new File("input_50000.txt");
        size = updateArray(f8);
        getTimes(size);

        File f9 = new File("input_100000.txt");
        size = updateArray(f9);
        getTimes(size);

        File f10 = new File("input_500000.txt");
        size = updateArray(f10);
        getTimes(size);
    }
}
