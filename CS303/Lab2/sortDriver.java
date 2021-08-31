package CS303.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sortDriver 
{
    public static void main(String[] args)
    {
        insertionSort iS = new insertionSort();

        int[] input_100 = new int[]{};
        String[] sArray = new String[]{};
        int[] sorted_100 = new int[]{};

        int[] input_1000 = new int[]{};
        String[] sArray2 = new String[]{};
        int[] sorted_1000 = new int[]{};

        File f1 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab2\\input_100.txt");
        File f2 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab2\\input_1000.txt");

        try 
        {
            Scanner sc = new Scanner(f1);
            sArray = sc.nextLine().trim().split(" ");
            input_100 = new int[sArray.length];
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        try 
        {
            Scanner sc = new Scanner(f2);
            sArray2 = sc.nextLine().trim().split(" ");
            input_1000 = new int[sArray2.length];
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        long sTime_100 = System.nanoTime();
        sorted_100 = iS.iSort(input_100);
        long eTime_100 = System.nanoTime() - sTime_100;

        System.out.println("Time taken to insertion sort array of 100 numbers: " + eTime_100);

        long sTime_1000 = System.nanoTime();
        sorted_1000 = iS.iSort(input_1000);
        long eTime_1000 = System.nanoTime() - sTime_1000;

        System.out.println("Time taken to insertion sort array of 1000 numbers: " + eTime_1000);
    }    
}
