/* Author: Vaishak Menon, Date: 10/26/21 */
package CS303.Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args)
    {
        ArrayList<Double> A = new ArrayList<Double>();
        ArrayList<String> S = new ArrayList<String>();

        File f = new File("");
        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose which file you would like to use: ");
        String[] choices = new String[]{"Data1.csv", "Data2.csv", "Data3.csv", "UPC.csv", "User Input"};
        for(int t = 0; t < choices.length; t++)
        {
            System.out.println((t + 1) + ": " + choices[t]);
        }

        int choice = userInput.nextInt();
        do
        {
            switch (choice) 
            {
            case 1:
                f = new File("Data1.csv");
                break;

            case 2:
                f = new File("Data2.csv");
                break;

            case 3:
                f = new File("Data3.csv");
                break;

            case 4:
                f = new File("UPC.csv");
                break;

            case 5:
                System.out.println("You have chosen User Input!");
                break;

            default:
                f = new File("Data2.csv");
                break;
            }

            if(choice != 5)
            {
                try 
                {
                    Scanner sc = new Scanner(f);
                    String[] s = new String[2];
                    int count = 0;
                    while (sc.hasNextLine()) 
                    {
                        s = sc.nextLine().trim().split(",");
                        A.add(Double.parseDouble(s[0]));
                        if (s.length != 1) 
                        {
                            S.add(s[1]);
                        } 
                        else 
                        {
                            s = new String[2];
                            s[0] = String.valueOf(A.get(count));
                            s[1] = "";
                            S.add(s[1]);
                        }
                        count++;
                    }

                    sc.close();
                } 
                catch (FileNotFoundException e) 
                {
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("Enter in the number of keys/values to enter into the HashMap");
                int inputNum = userInput.nextInt();

                double userKey = 0;
                String userValue = "";
                for(int i = 0; i < inputNum; i++)
                {
                    System.out.println("Enter in the key: ");
                    userKey = userInput.nextDouble();
                    System.out.println("Enter in the value: ");
                    userValue = userInput.next();
                    A.add(userKey);
                    S.add(userValue);
                }
            }
            
            //System.out.println("Enter size of HashMap:");
            //int HMsize = userInput.nextInt();
            HashMap H = new HashMap();

            System.out.println("Choose method of probing:");
            System.out.println("1: Put\n2: Linear Probe\n3. Quadratic Probe");
            int pChoice = userInput.nextInt();

            switch(pChoice)
            {
                case 1:
                    long totalTime = 0;
                    for (int j = 0; j < A.size(); j++) 
                    {
                        Double key = A.get(j);
                        String value = S.get(j);
                        // System.out.println("Put Key: " + key + " Put Value: " + value);
                        long bTime = System.nanoTime();
                        H.put(key, value);
                        long ebTime = System.nanoTime() - bTime;
                        totalTime += ebTime;
                    }
                    System.out.println("Total time take to put all keys using put method was : " + totalTime + " nanoseconds");
                    break;
                
                case 2:
                    totalTime = 0;
                    for (int j = 0; j < A.size(); j++) 
                    {
                        Double key = A.get(j);
                        String value = S.get(j);
                        // System.out.println("Put Key: " + key + " Put Value: " + value);
                        long bTime = System.nanoTime();
                        H.linearProbe(key, value);
                        long ebTime = System.nanoTime() - bTime;
                        totalTime += ebTime;
                    }
                    System.out.println("Total time take to put all keys using linear probe method was : " + totalTime + " nanoseconds");
                    break;
                
                case 3:
                    totalTime = 0;
                    for (int j = 0; j < A.size(); j++) 
                    {
                        Double key = A.get(j);
                        String value = S.get(j);
                        // System.out.println("Put Key: " + key + " Put Value: " + value);
                        long bTime = System.nanoTime();
                        H.quadraticProbe(key, value);
                        long ebTime = System.nanoTime() - bTime;
                        totalTime += ebTime;
                    }
                    System.out.println("Total time take to put all keys using quadratic probe method was : " + totalTime + " nanoseconds");
                    break;
            }

            /*
            for(int i = 0; i < H.table.length; i++)
            {
                HashEntry a = H.table[i];
                if(a == null)
                {
                    System.out.println("Index: " + i + ", Associated Key: null" + ", Associated Value: null");
                }
                else
                {
                    System.out.println("Index: " + i + ", Associated Key: " + a.getKey() + ", Associated Value: " + a.getValue());
                }
            }
            */
            /*
            System.out.println("Enter key for get function");
            Scanner sc2 = new Scanner(System.in);
            double inputKey = sc2.nextDouble();
            String returnGet = H.get(inputKey);
            System.out.println("Return from get is: " + returnGet);
            sc2.close();
            */
            
            ArrayList<Double> testInputNum = new ArrayList<Double>();
            ArrayList<String> testInputS = new ArrayList<String>();
            File f2 = new File("");

            System.out.println("Choose key file");
            System.out.println("1: input.dat\n2: KEYs.csv");
            int choice2 = userInput.nextInt();

            switch(choice2)
            {
                case 1:
                    f2 = new File("input.dat");
                    try 
                    {
                        String[] s = new String[3];
                        Scanner sc2 = new Scanner(f2);
                        while (sc2.hasNextLine()) 
                        {
                            s = sc2.nextLine().trim().split(",");
                            testInputNum.add(Double.parseDouble(s[0]));
                            testInputS.add(s[2]);
                        }
        
                        sc2.close();
                    } 
                    catch (FileNotFoundException e) 
                    {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    f2 = new File("KEYs.csv");
                    try 
                    {
                        String[] s = new String[3];
                        Scanner sc2 = new Scanner(f2);
                        while (sc2.hasNextLine()) 
                        {
                            s = sc2.nextLine().trim().split(",");
                            testInputNum.add(Double.parseDouble(s[0]));
                        }
        
                        sc2.close();
                    } 
                    catch (FileNotFoundException e) 
                    {
                        e.printStackTrace();
                    }
                    break;

                default:
                    f2 = new File("input.dat");
                    break;
            }

            long totalTime = 0;
            for (Double d : testInputNum) 
            {
                long bTime = System.nanoTime();
                String s = H.get(d);
                long ebTime = System.nanoTime() - bTime;
                totalTime += ebTime;
                System.out.println("Key: " + d + " Value: " + s);
            }
            System.out.println("Total time take to search for all keys was: " + totalTime + " nanoseconds");
                        

            System.out.println("Choose next action");
            System.out.println("Choose a new file or hit 6 to exit");
            for(int t = 0; t < choices.length; t++)
            {
                System.out.println((t + 1) + ": " + choices[t]);
            }
            System.out.println("6: Exit");
            choice = userInput.nextInt();
        }
        while(choice != 6);
        userInput.close();
    }  
}