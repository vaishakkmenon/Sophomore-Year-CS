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

        File f = new File("UPC.csv");
        try 
        {
            Scanner sc = new Scanner(f);
            String[] s = new String[2];
            while(sc.hasNextLine())
            {
                s = sc.nextLine().split(",");
                A.add(Double.parseDouble(s[0]));
                S.add(s[1]);
            }

            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        Node[] keys = new Node[A.size()];

        for(int i = 0; i < A.size(); i++)
        {
            keys[i] = new Node(A.get(i),S.get(i));
        }

        Node root = null;
        for (Node key: keys)
        {
            if(key != null)
            {
                //System.out.println(key.data);
                root = BST.TreeInsert(root, key);
            }
        }

        BST.inOrderTreeWalk(keys[keys.length-2]);

        /*
        ArrayList<Double> testInputNum = new ArrayList<Double>();
        ArrayList<String> testInputS = new ArrayList<String>();

        File f2 = new File("input.dat");
        try 
        {
            String[] s = new String[3];
            Scanner sc2 = new Scanner(f2);
            while(sc2.hasNextLine())
            {
                s = sc2.nextLine().split(",");
                testInputNum.add(Double.parseDouble(s[0]));
                testInputS.add(s[2]);
            }
            
            sc2.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        for(int i = 0; i < testInputNum.size(); i++)
        {
            Node n = BST.search(root, testInputNum.get(i));
            System.out.println("Key: " + n.data + " Description: " + n.s);
        }
        */
    }  
}
