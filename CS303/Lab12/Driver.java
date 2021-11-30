package CS303.Lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first choice for which file to use:");
        System.out.println("You can not exit the first time");
        String[] choices = new String[]{"MediumG.txt", "tinyG.txt", "Exit"};
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
                DFS dfs = new DFS();
                LinkedList<Vertex> V[];
                f = new File("tinyDG.txt");
                try 
                {
                    Scanner sc2 = new Scanner(f);
                    int[] specs = new int[2];
        
                    int a = 0;
                    String[] s = sc2.nextLine().split(" ");
                    while (s.length == 1) 
                    {
                        specs[a] = Integer.parseInt(s[0]);
                        s = sc2.nextLine().split(" ");
                        a++;
                    }       
                    
                    V = new LinkedList[specs[0]];
                    
                    for(int b = 0; b < specs[0]; b++)
                    {
                        V[b] = new LinkedList<Vertex>();
                    }
                    
                    int vID = Integer.parseInt(s[0]);
                    Vertex eID = new Vertex(Integer.parseInt(s[1]));

                    if (vID == 0 && V[vID].size() == 0) {
                        Vertex source = new Vertex(vID);
                        V[vID].add(source);
                    }
                    V[vID].add(eID);
                    do
                    {
                        s = sc2.nextLine().split(" ");
                        //System.out.println(s[0] + " " + s[1]);
                        vID = Integer.parseInt(s[0]);
                        eID = new Vertex(Integer.parseInt(s[1]));

                        if(vID == 0 && V[vID].size() == 0)
                        {
                            Vertex source = new Vertex(vID);
                            V[vID].add(source);
                        }
                        V[vID].add(eID);
                        
                    }
                    while(sc2.hasNextLine());

                    dfs.topologicalSort(V);
                    System.out.println();
                    System.out.println("Path: ");
                    dfs.printPath(V, V[0].getFirst(), V[0].getLast());
                    sc2.close();

                }
                catch (FileNotFoundException e) 
                {
                    System.out.println(e);
                }
                break;

                case 2:
                dfs = new DFS();
                f = new File("mediumG.txt");
                try 
                {
                    Scanner sc2 = new Scanner(f);
                    int[] specs = new int[2];
        
                    int a = 0;
                    String[] s = sc2.nextLine().split(" ");
                    while (s.length == 1) 
                    {
                        specs[a] = Integer.parseInt(s[0]);
                        s = sc2.nextLine().split(" ");
                        a++;
                    }       
                    
                    V = new LinkedList[specs[0]];
                    
                    for(int b = 0; b < specs[0]; b++)
                    {
                        V[b] = new LinkedList<Vertex>();
                    }
                    
                    int vID = Integer.parseInt(s[0]);
                    Vertex eID = new Vertex(Integer.parseInt(s[1]));

                    if (vID == 0 && V[vID].size() == 0) {
                        Vertex source = new Vertex(vID);
                        V[vID].add(source);
                    }
                    V[vID].add(eID);
                    do
                    {
                        s = sc2.nextLine().split(" ");
                        //System.out.println(s[0] + " " + s[1]);
                        vID = Integer.parseInt(s[0]);
                        eID = new Vertex(Integer.parseInt(s[1]));

                        if(vID == 0 && V[vID].size() == 0)
                        {
                            Vertex source = new Vertex(vID);
                            V[vID].add(source);
                        }
                        V[vID].add(eID);
                        
                    }
                    while(sc2.hasNextLine());

                    dfs.topologicalSort(V);
                    System.out.println();
                    dfs.printPath(V, V[0].getFirst(), V[0].get(1));

                    sc2.close();

                }
                catch (FileNotFoundException e) 
                {
                    System.out.println(e);
                }
                break;
            }
            System.out.println();

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
