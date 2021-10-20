/* Author: Vaishak Menon Date: 10/19/2021*/
package CS303.Lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumberGenerator 
{
    public String getNewFile(int size)
    {
        Random r = new Random();
        String file = "input_" + size + ".txt";
        File f = new File(file);
        try 
        {
            FileWriter fw = new FileWriter(f);
            for(int i = 0; i < size; i++)
            {
                int randNum = r.nextInt(size);
                fw.write(randNum + " ");
            }
            fw.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        return file;
    }  
}
