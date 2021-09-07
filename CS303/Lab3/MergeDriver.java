package CS303.Lab3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MergeDriver 
{
    public static void main(String[] args)
    {
        File f1 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab3\\input_100.txt");
        Merge mFun = new Merge();
        int[] array_100 = new int[]{};

        try
        {
            Scanner sc = new Scanner(f1);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_100 = new int[sArray.length];
            for(int i = 0; i < sArray.length; i++)
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

        mFun.mergeSort(array_100, tempArray,0, array_100.length-1);

        File f2 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab3\\input_1000.txt");
        int[] array_1000 = new int[]{};
        try
        {
            Scanner sc = new Scanner(f2);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_1000 = new int[sArray.length];
            for(int i = 0; i < sArray.length; i++)
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

        mFun.mergeSort(array_1000, tempArray,0, array_1000.length-1);

        File f3 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab3\\input_5000.txt");
        int[] array_5000 = new int[]{};
        try
        {
            Scanner sc = new Scanner(f3);
            String[] sArray = sc.nextLine().trim().split(" ");
            array_5000 = new int[sArray.length];
            for(int i = 0; i < sArray.length; i++)
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

        mFun.mergeSort(array_5000, tempArray,0, array_5000.length-1);
    }    
}
