package CS303.Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogDriver {
    public static void main(String[] args) 
    {

        LogSort ls = new LogSort();

        File f = new File("NovelSortInput.txt");
        ArrayList<String> cities = new ArrayList<String>();
        ArrayList<Integer> times = new ArrayList<Integer>();

        try 
        {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) 
            {
                String[] log = sc.nextLine().trim().split(" ");
                //Index for last element
                int last = log.length-1;

                if (log.length == 2) 
                {
                    String city = log[0];
                    String time = "";
                    if (!(log[0].isEmpty())) 
                    {
                        time = log[last];
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
                else
                {
                    String city = "";
                    for(int i = 0; i < last;i++)
                    {
                        city = city + log[i];
                    }

                    String time = "";
                    if (!(log[0].isEmpty())) 
                    {
                        time = log[last];
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

            }
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        ArrayList<String> newTimes = ls.convert(times);

        System.out.println("Unsorted Cities: ");
        for (String s : cities) {System.out.print(s + " ");}
        System.out.println();
        for (String x : newTimes) {System.out.print(x + " ");}

        ls.sort(cities, times);
        newTimes = ls.convert(times);

        System.out.println();
        System.out.println("Sorted Cities: ");
        for (String s : cities) {System.out.print(s + " ");}
        System.out.println();
        for (String x : newTimes) {System.out.print(x + " ");}
    }
}
