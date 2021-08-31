package CS303.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sortDriver 
{
    public static void main(String[] args)
    {
        insertionSort iS = new insertionSort();
        int[] input_100 = new int[10];
        String[] sArray = new String[10];
        int[] sorted_100 = new int[10];

        File f1 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab2\\input_100.txt");

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

        System.out.println(sArray.length);
        for(int i = 0; i < sArray.length; i++)
        {
            input_100[i] = Integer.parseInt(sArray[i]);
            System.out.print(input_100[i] + " ");
        }
        
        System.out.println("Length: " + input_100.length);
        sorted_100 = iS.iSort(input_100);

        for(int j = 0; j < sorted_100.length; j++)
        {
            System.out.print(sorted_100[j] + " ");
        }
    }    
}
