package CS303.Lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Lab7Driver 
{
    private static Lab7Sorts ls = new Lab7Sorts();
    private static InsertionSort is = new InsertionSort();
    private static Merge ms = new Merge();
    private static HeapSort hp = new HeapSort();
    private static QuickSort qs = new QuickSort();

    private static int[] iArray = new int[]{};
    private static int[] mArray = new int[]{};
    private static int[] hArray = new int[]{};
    private static int[] qsArray = new int[]{};
    private static int[] tempArray = new int[]{};
    private static int[] ssArray = new int[]{};
    private static int[] bsArray = new int[]{};

    private static int updateArray(File f)
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
            ssArray = new int[sLength];
            bsArray = new int[sLength];

            for(int i = 0; i < sLength; i++)
            {
                iArray[i] = Integer.parseInt(sArray[i]);
                mArray[i] = Integer.parseInt(sArray[i]);
                hArray[i] = Integer.parseInt(sArray[i]);
                qsArray[i] = Integer.parseInt(sArray[i]);
                ssArray[i] = Integer.parseInt(sArray[i]);
                bsArray[i] = Integer.parseInt(sArray[i]);
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

    private static void getTimes(int size)
    {
        long iTime = System.nanoTime();
        is.iSortR(iArray);
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
        NumberGenerator ng = new NumberGenerator();
        Random r = new Random();
        int randomSize = 1024;

        File f = new File("bonus_random.txt");

        int[] random = new int[]{};
        int[] reversed = new int[]{};
        int[] sorted = new int[]{};
        
        try 
        {
            random = new int[randomSize];
            FileWriter fw = new FileWriter(f);
            for(int i = 0; i < randomSize; i++)
            {
                int randNum = r.nextInt(randomSize);
                fw.write(randNum + " ");
                random[i] = randNum;
            }
            fw.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        is.iSortR(random);
        reversed = random;

        is.iSort(random);
        sorted = random;

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
        ls.bubbleSort(random);
        long erdTime2 = System.nanoTime() - rdTime2;
        System.out.println("Time taken to bubble sort array of random numbers: " + erdTime2);

        long rsTime2 = System.nanoTime();
        ls.bubbleSort(reversed);
        long ersTime2 = System.nanoTime() - rsTime2;
        System.out.println("Time taken to bubble sort array of reversed sorted numbers: " + ersTime2);

        long sTime2 = System.nanoTime();
        ls.bubbleSort(sorted);
        long esTime2 = System.nanoTime() - sTime2;
        System.out.println("Time taken to bubble sort array of sorted numbers: " + esTime2 + "\n");

        
        
        int size;

        /*
        File f4 = new File("input_100.txt");
        size = updateArray(f4);
        getTimes(size);
        */
        
        File f4 = new File("input_1000.txt");
        size = updateArray(f4);
        getTimes(size);
        
        size *= 2;

        String newFile = ng.getNewFile(size);
        File f5 = new File(newFile);
        size = updateArray(f5);
        getTimes(size);

        size *= 2;

        String newFile2 = ng.getNewFile(size);
        File f6 = new File(newFile2);
        size = updateArray(f6);
        getTimes(size);

        size *= 2;

        String newFile3 = ng.getNewFile(size);
        File f7 = new File(newFile3);
        size = updateArray(f7);
        getTimes(size);

        size *= 2;

        String newFile4 = ng.getNewFile(size);
        File f8 = new File(newFile4);
        size = updateArray(f8);
        getTimes(size);
        
    }
}
