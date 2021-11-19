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
                BFS bfs = new BFS();
                f = new File("mediumG.txt");
                LinkedList<Vertex> V[];
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
                    
                    while(sc2.hasNextLine())
                    {
                        s = sc2.nextLine().split(" ");
                        int vID = Integer.parseInt(s[0]);
                        Vertex eID = new Vertex(Integer.parseInt(s[1]));
                        if(V[vID].size() == 0)
                        {
                            Vertex firstV = new Vertex(vID);
                            V[vID].add(0,firstV);
                        }
                        V[vID].add(eID);
                    }

                    bfs = new BFS();

                    System.out.println("Print source vertex number: ");
                    int source = sc.nextInt();

                    System.out.println();

                    long bTime = System.nanoTime();
                    bfs.BFSearch3(V, source);
                    long ebTime = System.nanoTime() - bTime;
                    System.out.println("Total time take to search for all keys was: " + ebTime + " nanoseconds");

                    for(int b = 0; b < V.length; b++)
                    {
                        if(V[b].size() != 0)
                        {
                            System.out.println("Path from " + source + " to " + b);
                            bfs.printPath(V, V[source].getFirst(), V[b].getFirst());
                            System.out.println();
                        }
                    }
                    
                    sc2.close();
                }
                catch (FileNotFoundException e) 
                {
                    System.out.println(e);
                }
                break;

                case 2:
                f = new File("largeG.txt");
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
                    
                    while(sc2.hasNextLine())
                    {
                        s = sc2.nextLine().split(" ");
                        int vID = Integer.parseInt(s[0]);
                        Vertex eID = new Vertex(Integer.parseInt(s[1]));
                        if(V[vID].size() == 0)
                        {
                            Vertex firstV = new Vertex(vID);
                            V[vID].add(0,firstV);
                        }
                        V[vID].add(eID);
                    }

                    bfs = new BFS();

                    System.out.println("Print source vertex number: ");
                    int source = sc.nextInt();

                    System.out.println();

                    long bTime = System.nanoTime();
                    bfs.BFSearch3(V, source);
                    long ebTime = System.nanoTime() - bTime;
                    System.out.println("Total time take to search for all keys was: " + ebTime + " nanoseconds");

                    /*
                    for(int b = 0; b < V.length; b++)
                    {
                        if(V[b].size() != 0)
                        {
                            System.out.println("Path from " + source + " to " + b);
                            bfs.printPath(V, V[source].getFirst(), V[b].getFirst());
                            System.out.println();
                        }
                    }
                    */

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
