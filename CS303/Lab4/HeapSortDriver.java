package CS303.Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HeapSortDriver 
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\input_files\\input_100.txt");
        HeapSort hp2 = new HeapSort();

        int[] input_100 = new int[]{};
        String[] sArray = new String[]{};

        try 
        {
            Scanner sc = new Scanner(f);
            sArray = sc.nextLine().trim().split(" ");
            input_100 = new int[sArray.length];
            int sLength = sArray.length;
            for(int i = 0; i < sLength; i++)
            {
                input_100[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        hp2.sort(input_100);

    }
}
