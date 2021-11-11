import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first choice for which file to use:");
        System.out.println("You can not exit the first time");
        String[] choices = new String[]{"MediumG.txt", "LargeG.txt", "Exit"};
        int i = 1;
        for(String s : choices)
        {
            System.out.println(i + ": " + s);
            i++;
        }

        int choice = sc.nextInt(); 
        System.out.println("Your choice: " + choice);
        File f;

        do
        {
            switch (choice) 
            {
                case 1:
                    f = new File("MediumG.txt");
                    try 
                    {
                        Scanner choice1 = new Scanner(f);
                        while(choice1.hasNextLine())
                        {
                            LinkedList<Integer> edges = new LinkedList<Integer>();
                            int vertex;
                            if(choice1.nextLine().length() != 1)
                            {
                                String[] s = choice1.nextLine().split(" ");
                                vertex = Integer.parseInt(s[0]);
                            }
                            

                        }
                        choice1.close();
                    } 
                    catch (FileNotFoundException e) 
                    {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    f = new File("LargeG.txt");
                    try 
                    {
                        Scanner choice2 = new Scanner(f);
                        choice2.close();
                    } 
                    catch (FileNotFoundException e) 
                    {
                        e.printStackTrace();
                    }
                    break;
            }
            
            i = 1;
            for (String s : choices) 
            {
                System.out.println(i + ": " + s);
                i++;
            }
            System.out.println("Enter file number from menu: ");
            choice = sc.nextInt();
            System.out.println("Your choice: " + choice);
        }
        while(choice != 3);
        sc.close();
    }
}
