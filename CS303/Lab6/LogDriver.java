package CS303.Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogDriver 
{
    public static void main(String[] args)
    {

        LogSort ls= new LogSort();

        File f = new File("NovelSortInput.txt");
        ArrayList<String> cities = new ArrayList<String>();
        ArrayList<Integer> times = new ArrayList<Integer>();

        try 
        {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) 
            {
                String[] log = sc.nextLine().trim().split(" ");
                String city = log[0];
                String time = "";
                if (!(log[0].isEmpty())) 
                {
                    time = log[1];
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

        ls.sort(cities, 0, cities.size()-1);

    }
}
