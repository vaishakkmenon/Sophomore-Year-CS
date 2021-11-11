import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args)
    {
        File f = new File("MediumG.txt");
        Scanner sc;
        try {
            sc = new Scanner(f);
            while (sc.hasNextLine()) 
            {
                String[] s = sc.nextLine().split(" ");
                String[] s2 = sc.nextLine().split(" ");
                for (String a : s) 
                {
                    System.out.print("S: "+ a + " ");
                }
                System.out.println();
                for (String b : s2) 
                {
                    System.out.print("S2: "+ b + " ");
                }
                System.out.println();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
