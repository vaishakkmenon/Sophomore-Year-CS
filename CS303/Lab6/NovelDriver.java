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
        NovelSort ns = new NovelSort();
        System.out.println("100 Elements: ");
        File f = new File("input_100.txt");
        updateArray(f);
        int[] sorted = ns.sort(array);
        for(int i:sorted)
        {
            System.out.print(i + " ");
        }

        /*
        System.out.println("\n1000 Elements: ");
        File f2 = new File("input_1000.txt");
        updateArray(f2);
        sorted = ns.sort(array);
        for(int i:sorted)
        {
            System.out.print(i + " ");
        }
        */

    }    
}