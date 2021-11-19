import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args) 
    {
        File f = new File("MediumG.txt");
        try 
        {
            Scanner choice1 = new Scanner(f);

            String[] s = choice1.nextLine().split(" ");
            while(s.length == 1)
            {
                s = choice1.nextLine().split(" ");
            }
            int originalV = Integer.parseInt(s[0]);
            int vertex = Integer.parseInt(s[0]);

            do
            {
                //System.out.println("Here");
                LinkedList<Integer> edges = new LinkedList<Integer>();
                if(originalV == vertex)
                {
                    edges.add(Integer.parseInt(s[1]));
                    s = choice1.nextLine().split(" ");
                    vertex = Integer.parseInt(s[0]);
                }
                else
                {
                    //System.out.println("Different");
                    //System.out.println("Original Vertex: " + originalV);
                    //System.out.println("Vertex: " + vertex);
                    originalV = vertex;
                    s = choice1.nextLine().split(" ");
                }
            }
            while(choice1.hasNextLine());
            choice1.close();
            
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
}
