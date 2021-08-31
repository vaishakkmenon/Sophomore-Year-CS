package CS303.Lab1;

import java.io.*;
import java.util.*;


public class Lab1Driver
{   
    public static void main(String[] args)
    {
        SearchFunctions sf = new SearchFunctions();
        Random r = new Random();

        int[] array_100 = new int[]{};
        String[] sArray;

        int[] array_1000 = new int[]{};
        String[] s2Array;

        int[] randNumArray = new int[1000];

        File f1 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab1\\input_100.txt");
        File f2 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab1\\input_1000.txt");
        File f3 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab1\\random_numbers.txt");

        try 
        {
            Scanner sc = new Scanner(f1);
            
            String numbers = sc.nextLine();
            numbers = numbers.trim();
            sArray = numbers.split(" ");
            array_100 = new int[sArray.length];

            int i = 0;
            for(String x: sArray)
            {
                int j = Integer.parseInt(x);
                array_100[i] = j;
                i++;
            }

            sc.close();

        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        try
        {
            Scanner sc2 = new Scanner(f2);

            String numbers2 = sc2.nextLine();
            numbers2 = numbers2.trim();
            s2Array = numbers2.split(" ");
            System.out.println("Size: " + s2Array.length);
            array_1000 = new int[s2Array.length];

            int m = 0;
            for(String z: s2Array)
            {
                int k = Integer.parseInt(z);
                array_1000[m] = k;
                m++;
            }

            sc2.close();
        }
        catch(FileNotFoundException e2)
        {
            e2.printStackTrace();
        }

        try 
        {
            FileWriter fw = new FileWriter(f3);
            for(int x = 0; x < 1000; x++)
            {
                int randNum = r.nextInt(1000);
                fw.write(randNum + " ");
                randNumArray[x] = randNum;
            }
            fw.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        int lSearch100 = 0;
        for(int i = 0; i < randNumArray.length; i++)
        {
            lSearch100 = sf.linearSearch(array_100[i], randNumArray);
            if(lSearch100 != 0 && lSearch100 != -1)
            {
                break;
            }
        }

        int lSearch1000 = 0;
        for(int h = 0; h < randNumArray.length; h++)
        {
            lSearch1000 = sf.linearSearch(array_1000[h], randNumArray);
            if(lSearch1000 != 0 && lSearch1000 != -1)
            {
                break;
            }
        }

        Arrays.sort(randNumArray);
            
        System.out.println();
        int bSearch100 = 0;
        for(int j = 0; j < randNumArray.length; j++)
        {
            bSearch100 = sf.binarySearch(array_100[j], randNumArray, 0, randNumArray.length-1);
            if(bSearch100 != 0 && bSearch100 != -1)
            {
                break;
            }
        }

        int bSearch1000 = 0;
        for(int k = 0; k < randNumArray.length; k++)
        {
            bSearch1000 = sf.binarySearch(40, randNumArray, 0, randNumArray.length-1);
            if(bSearch1000 != 0 && bSearch1000 != -1)
            {
                break;
            }
        }

        System.out.println("Index of a number in random number list using Linear Search with input_100 search keys:" + lSearch100);
        System.out.println("Index of a number in random number list using Binary Search with input_100 search keys:" + bSearch100);

        System.out.println("Index of a number in random number list using Linear Search with input_1000 search keys:" + lSearch1000);
        System.out.println("Index of a number in random number list using Binary Search with input_1000 search keys:" + bSearch1000);
        
    }
}