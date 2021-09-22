package CS303.Lab5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class QuickSortOnlyDriver 
{
    public static void main(String[] args)
    {
        QuickSort qs = new QuickSort();
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
        System.out.println("Time taken to quick sort array of sorted numbers: " + esTime);
    }
}
