package CS303.Lab8;

public class BST extends Node
{

    BST(Double key, String s)
    {
        super(key, s);
    }

    public static Node TreeInsert(Node T, Node z)
    {
        Node y = null;
        Node x = T;

        while(x != null)
        {
            y = x;
            if(z.data < x.data)
            {
                x = x.left;
            }
            else
            {
                x = x.right;
            }
        }

        if(y == null)
        {
            T = z;
        }
        else if(z.data < y.data)
        {
            y.left = z;
        }
        else
        {
            y.right = z;
        }

        return T;
    }

    public static void inOrderTreeWalk(Node x)
    {
        if(x != null)
        {
            inOrderTreeWalk(x.left);
            System.out.println(x.data);
            inOrderTreeWalk(x.right);
        }
    }

    public static Node search(Node x, double k)
    {
        while((x != null) && (k != x.data))
        {
            if(k < x.data)
            {
                x = x.left;
            }
            else
            {
                x = x.right;
            }
        }
        return x;
    }
}