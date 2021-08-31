package CS303.Lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class HW1Driver 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int startNum = 16;
        int[] nArray = new int[]{};
        int[] randNumArray = new int[1000];
        File f1 = new File("C:\\Users\\vaish\\SophYearCS\\CS303\\Lab1\\random_numbers.txt");
        SearchFunctions sf = new SearchFunctions();
        
        try 
        {
            FileWriter fw = new FileWriter(f1);
            for(int x = 0; x < 1000; x++)
            {
                int randNum = r.nextInt((int)Math.pow(2,25));
                fw.write(randNum + " ");
                randNumArray[x] = randNum;
            }
            fw.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        

        for(int k = startNum; k <= (int) Math.pow(2, 25); k*=2)
        {
            nArray = new int[k];
            
            System.out.println("nArray length: " + nArray.length);
            for(int x = 0; x < nArray.length; x++)
            {
                nArray[x] = r.nextInt(startNum + 1);
            }

            System.out.println();

            int lSearch = 0;
            long linSTime = System.nanoTime();
            for(int i = 0; i < randNumArray.length; i++)
            {
                lSearch = sf.linearSearch(randNumArray[i], nArray);
                if(lSearch != 0 && lSearch != -1)
                {
                    break;
                }
            }
            long linSTimeEnd = System.nanoTime() - linSTime;
            System.out.println("LSearch index in array: " + lSearch);
            System.out.println("Time: " + linSTimeEnd);


            int bSearch = 0;
            Arrays.sort(nArray);
            
            System.out.println();

            long binSTime = System.nanoTime();
            for(int j = 0; j < randNumArray.length; j++)
            {
                bSearch = sf.binarySearch(randNumArray[j], nArray, 0, nArray.length-1);
                if(bSearch != 0 && bSearch != -1)
                {
                    break;
                }
            }
            long binSTimeEnd = System.nanoTime() - binSTime;
            System.out.println("BSearch Results: " + bSearch);
            System.out.println("Time: " + binSTimeEnd);
            
            System.out.println();
        }
    }   
}