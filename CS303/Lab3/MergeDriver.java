package CS303.Lab3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MergeDriver 
{
    public static void main(String[] args)
    {
        File f1 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab3\\input_100.txt");
        MergeFunctions mFun = new MergeFunctions();
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

        for(int j : array_100)
        {
            System.out.print(j + " ");
        }

        System.out.println();
        //int[] tempArray = new int[array_100.length];
        mFun.mergeSort(array_100, 0, array_100.length-1);

        for(int j : array_100)
        {
            System.out.print(j + " ");
        }

    }    
}
