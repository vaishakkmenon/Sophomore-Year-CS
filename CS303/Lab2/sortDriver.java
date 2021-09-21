/* Author: Vaishak Menon, Date: 09/07/2021 */
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

        int[] input_1000 = new int[]{};
        String[] sArray2 = new String[]{};

        int[] input_5000 = new int[]{};
        String[] sArray3 = new String[]{};
        
        int[] input_10000 = new int[]{};
        String[] sArray4 = new String[]{};

        int[] input_50000 = new int[]{};
        String[] sArray5 = new String[]{};

        int[] input_100000 = new int[]{};
        String[] sArray6 = new String[]{};

        int[] input_500000 = new int[]{};
        String[] sArray7 = new String[]{};

        File f1 = new File("input_100.txt");
        File f2 = new File("input_1000.txt");
        File f3 = new File("input_5000.txt");
        File f4 = new File("input_10000.txt");
        File f5 = new File("input_50000.txt");
        File f6 = new File("input_100000.txt");
        File f7 = new File("input_500000.txt");


        try 
        {
            Scanner sc = new Scanner(f1);
            sArray = sc.nextLine().trim().split(" ");
            input_100 = new int[sArray.length];
            for(int i = 0; i < input_100.length; i++)
            {
                input_100[i] = Integer.valueOf(sArray[i]);
            }
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
            for(int i = 0; i < input_1000.length; i++)
            {
                input_1000[i] = Integer.valueOf(sArray2[i]);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        try 
        {
            Scanner sc = new Scanner(f3);
            sArray3 = sc.nextLine().trim().split(" ");
            input_5000 = new int[sArray3.length];
            for(int i = 0; i < input_5000.length; i++)
            {
                input_5000[i] = Integer.valueOf(sArray3[i]);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        try 
        {
            Scanner sc = new Scanner(f4);
            sArray4 = sc.nextLine().trim().split(" ");
            input_10000 = new int[sArray4.length];
            for(int i = 0; i < input_10000.length; i++)
            {
                input_10000[i] = Integer.valueOf(sArray4[i]);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        try 
        {
            Scanner sc = new Scanner(f5);
            sArray5 = sc.nextLine().trim().split(" ");
            input_50000 = new int[sArray5.length];
            for(int i = 0; i < input_50000.length; i++)
            {
                input_50000[i] = Integer.valueOf(sArray5[i]);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        try 
        {
            Scanner sc = new Scanner(f6);
            sArray6 = sc.nextLine().trim().split(" ");
            input_100000 = new int[sArray6.length];
            for(int i = 0; i < input_100000.length; i++)
            {
                input_100000[i] = Integer.valueOf(sArray6[i]);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        try 
        {
            Scanner sc = new Scanner(f7);
            sArray7 = sc.nextLine().trim().split(" ");
            input_500000 = new int[sArray7.length];
            for(int i = 0; i < input_500000.length; i++)
            {
                input_500000[i] = Integer.valueOf(sArray7[i]);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        long sTime_100 = System.nanoTime();
        input_100 = iS.iSort(input_100);
        long eTime_100 = System.nanoTime() - sTime_100;

        System.out.println("Time taken to insertion sort array of 100 numbers: " + eTime_100);

        long sTime_1000 = System.nanoTime();
        input_1000 = iS.iSort(input_1000);
        long eTime_1000 = System.nanoTime() - sTime_1000;

        System.out.println("Time taken to insertion sort array of 1000 numbers: " + eTime_1000);

        long sTime_5000 = System.nanoTime();
        input_5000 = iS.iSort(input_5000);
        long eTime_5000 = System.nanoTime() - sTime_5000;

        System.out.println("Time taken to insertion sort array of 5000 numbers: " + eTime_5000);

        long sTime_10000 = System.nanoTime();
        input_10000 = iS.iSort(input_10000);
        long eTime_10000 = System.nanoTime() - sTime_10000;

        System.out.println("Time taken to insertion sort array of 10000 numbers: " + eTime_10000);

        long sTime_50000 = System.nanoTime();
        input_50000 = iS.iSort(input_50000);
        long eTime_50000 = System.nanoTime() - sTime_50000;

        System.out.println("Time taken to insertion sort array of 50000 numbers: " + eTime_50000);

        long sTime_100000 = System.nanoTime();
        input_100000 = iS.iSort(input_100000);
        long eTime_100000 = System.nanoTime() - sTime_100000;

        System.out.println("Time taken to insertion sort array of 100000 numbers: " + eTime_100000);

        long sTime_500000 = System.nanoTime();
        input_500000 = iS.iSort(input_500000);
        long eTime_500000 = System.nanoTime() - sTime_500000;

        System.out.println("Time taken to insertion sort array of 500000 numbers: " + eTime_500000);
    }    
}
