package CS303.Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogDriver 
{
    public static void main(String[] args)
    {
        File f = new File("NovelSortInput.txt");
        ArrayList<String> cities = new ArrayList<String>();
        ArrayList<Integer> times = new ArrayList<Integer>();

        try 
        {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) 
            {
                String[] logs = sc.nextLine().trim().split(" ");
                String city = logs[0];
                String time = "";
                if (!(logs[0].isEmpty())) 
                {
                    time = logs[1];
                    String[] timeSplit = time.split(":");
                    String s = "";
                    for (int i = 0; i < timeSplit.length; i++) 
                    {
                        s += timeSplit[i];
                    }
                    int newTime = Integer.parseInt(s);
                    cities.add(city);
                    times.add(newTime);
                }
            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        for(int a = 0; a < cities.size(); a++)
        {
            System.out.println(cities.get(a));
        }

        for(int b = 0; b < times.size(); b++)
        {
            System.out.println(times.get(b));
        }

    }
}
