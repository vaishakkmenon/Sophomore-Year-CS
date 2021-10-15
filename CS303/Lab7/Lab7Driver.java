package CS303.Lab7;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab7Driver 
{
    private static Lab7Sorts ls = new Lab7Sorts();

    private static int[] ssArray = new int[]{};
    private static int[] bsArray = new int[]{};

    private static int updateArray(File f)
    {
        int length = 0;
        try
        {
            Scanner sc = new Scanner(f);
            String[] sArray = sc.nextLine().trim().split(" ");
            int sLength = sArray.length;
            length = sLength;
            ssArray = new int[sLength];
            bsArray = new int[sLength];

            for(int i = 0; i < sLength; i++)
            {
                ssArray[i] = Integer.parseInt(sArray[i]);
                bsArray[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return length;
    }

    private static void getTimes(int size)
    {
        long ssTime = System.nanoTime();
        ls.selectionSort(ssArray);
        long esTime = System.nanoTime() - ssTime;
        System.out.println("Time taken to selection sort array of " + size + " numbers: " + esTime);

        long bTime = System.nanoTime();
        ls.bubbleSort(bsArray);
        long ebTime = System.nanoTime() - bTime;
        System.out.println("Time taken to bubble sort array of " + size + " numbers: " + ebTime + "\n");
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
            int sLength = sArray.length;
            random = new int[sLength];
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
            int sLength = sArray.length;
            reversed = new int[sLength];
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
            int sLength = sArray.length;
            sorted = new int[sLength];
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
        ls.selectionSort(random);
        long erdTime = System.nanoTime() - rdTime;
        System.out.println("Time taken to selection sort array of random numbers: " + erdTime);

        long rsTime = System.nanoTime();
        ls.selectionSort(reversed);
        long ersTime = System.nanoTime() - rsTime;
        System.out.println("Time taken to selection sort array of reversed sorted numbers: " + ersTime);

        long sTime = System.nanoTime();
        ls.selectionSort(sorted);
        long esTime = System.nanoTime() - sTime;
        System.out.println("Time taken to selection sort array of sorted numbers: " + esTime + "\n");

        long rdTime2 = System.nanoTime();
        ls.selectionSort(random);
        long erdTime2 = System.nanoTime() - rdTime2;
        System.out.println("Time taken to bubble sort array of random numbers: " + erdTime2);

        long rsTime2 = System.nanoTime();
        ls.selectionSort(reversed);
        long ersTime2 = System.nanoTime() - rsTime2;
        System.out.println("Time taken to bubble sort array of reversed sorted numbers: " + ersTime2);

        long sTime2 = System.nanoTime();
        ls.selectionSort(sorted);
        long esTime2 = System.nanoTime() - sTime2;
        System.out.println("Time taken to bubble sort array of sorted numbers: " + esTime2 + "\n");

        
        
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
    }
}
