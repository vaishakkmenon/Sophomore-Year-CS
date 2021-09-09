package CS303.Lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HeapSortDriver 
{
    public static void main(String[] args)
    {
        File f1 = new File("input_100.txt");
        HeapSort hp = new HeapSort();
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

        long sTime_100 = System.nanoTime();
        hp.sort(array_100);
        long eTime_100 = System.nanoTime() - sTime_100;
        System.out.println("Time taken to heapsort array of 100 numbers: " + eTime_100);
        
        
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

        long sTime_1000 = System.nanoTime();
        hp.sort(array_1000);
        long eTime_1000 = System.nanoTime() - sTime_1000;
        System.out.println("Time taken to heapsort array of 1000 numbers: " + eTime_1000);

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

        long sTime_5000 = System.nanoTime();
        hp.sort(array_5000);
        long eTime_5000 = System.nanoTime() - sTime_5000;
        System.out.println("Time taken to heapsort array of 5000 numbers: " + eTime_5000);

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

        long sTime_10000 = System.nanoTime();
        hp.sort(array_10000);
        long eTime_10000 = System.nanoTime() - sTime_10000;
        System.out.println("Time taken to heapsort array of 10000 numbers: " + eTime_10000);

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

        long sTime_50000 = System.nanoTime();
        hp.sort(array_50000);
        long eTime_50000 = System.nanoTime() - sTime_50000;
        System.out.println("Time taken to heapsort array of 50000 numbers: " + eTime_50000);

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

        long sTime_100000 = System.nanoTime();
        hp.sort(array_100000);
        long eTime_100000 = System.nanoTime() - sTime_100000;
        System.out.println("Time taken to heapsort array of 100000 numbers: " + eTime_100000);

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

        long sTime_500000 = System.nanoTime();
        hp.sort(array_500000);
        long eTime_500000 = System.nanoTime() - sTime_500000;
        System.out.println("Time taken to heapsort array of 500000 numbers: " + eTime_500000);
    }
}
