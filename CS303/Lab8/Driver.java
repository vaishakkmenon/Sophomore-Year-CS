/* Author: Vaishak Menon, Date: 10/26/21 */
package CS303.Lab8;

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
        String[] choices = new String[]{"Data1.csv", "Data2.csv", "Data3.csv", "UPC.csv"};
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

            default:
                f = new File("Data1.csv");
                break;
            }

            try 
            {
                Scanner sc = new Scanner(f);
                String[] s = new String[2];
                int count = 0;
                while (sc.hasNextLine()) {
                    s = sc.nextLine().trim().split(",");
                    A.add(Double.parseDouble(s[0]));
                    if (s.length != 1) {
                        S.add(s[1]);
                    } else {
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

            Node[] keys = new Node[A.size()];

            for (int i = 0; i < keys.length; i++) 
            {
                keys[i] = new Node(A.get(i), S.get(i));
            }

            Node root = null;
            for (Node key : keys) 
            {
                if (key != null) 
                {
                    root = BST.TreeInsert(root, key);
                }
            }

            if (choice == 2 || choice == 3) 
            {
                BST.inOrderTreeWalk(root);
            } 
            else if(choice == 1 || choice == 4)
            {
                System.out.println("WILL NOT RUN INORDER TRAVERSAL DUE TO STACK OVERFLOW ERROR");
            }
            else
            {
                System.out.println("Default file chosen, Data1.csv is being used");
            }

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

            for (int i = 0; i < testInputNum.size(); i++) 
            {
                long hTime = System.nanoTime();
                Node n = BST.search(root, testInputNum.get(i));
                long ehTime = System.nanoTime() - hTime;
                if(n != null)
                {
                    System.out.println("Time take to search for the key " + testInputNum.get(i) + ": " + ehTime);
                    System.out.println("Key: " + n.key + " Description: " + n.description);
                }
                if(n == null)
                {
                    System.out.println("Key " + testInputNum.get(i) + " has no description in the file you searched for!");
                }
            }

            System.out.println("Choose next action");
            System.out.println("Choose a new file or hit 5 to exit");
            for(int t = 0; t < choices.length; t++)
            {
                System.out.println((t + 1) + ": " + choices[t]);
            }

            choice = userInput.nextInt();
        }
        while(choice != 5);
        userInput.close();
    }  
}
