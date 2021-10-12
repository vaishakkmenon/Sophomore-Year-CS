package CS303.Lab6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NovelDriver 
{

    private static int[] array = new int[]{};

    public static void updateArray(File f)
    {
        try
        {
            Scanner sc = new Scanner(f);
            String[] sArray = sc.nextLine().trim().split(" ");
            int sLength = sArray.length;

            array = new int[sLength];

            for(int i = 0; i < sLength; i++)
            {
                array[i] = Integer.parseInt(sArray[i]);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        NovelSwap ns = new NovelSwap();
        File f = new File("input_100.txt");
        updateArray(f);

        System.out.println("Before Sorting: ");
        for(int i : array)
        {
            System.out.print(i + " ");
        }

        System.out.println("\n" + array.length + " Elements: ");
        long iTime = System.nanoTime();
        ns.sort(array);
        long eiTime = System.nanoTime() - iTime;
        System.out.println("Time taken to novel sort + insertion sort array of " + array.length + " numbers: " + eiTime);

        System.out.println("After Sorting: ");
        for(int i : array)
        {
            System.out.print(i + " ");
        }

        File f2 = new File("input_1000.txt");
        updateArray(f2);

        System.out.println("\n" + array.length + " Elements: ");
        long iTime2 = System.nanoTime();
        ns.sort(array);
        long eiTime2 = System.nanoTime() - iTime2;
        System.out.println("Time taken to novel sort + insertion sort array of " + array.length + " numbers: " + eiTime2);
    }    
}