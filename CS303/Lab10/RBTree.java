package CS303.Lab10;

import java.awt.Color;

public class RBTree extends BST
{
    RBTree(Double key, String s) 
    {
        super(key, s);
    }

    public void RBInsert(Node T, Node z)
    {
        Node y = null;
        Node x= T;

        while(x != null)
        {
            y = x;
            if(z.key < x.key)
            {
                x = x.left;
            }
            else
            {
                x = x.right;
            }
        }

        z.parent = y;
        if(y == null)
        {
            T = z;
        }
        else if(z.key < y.key)
        {
            y.left = z;
        }
        else
        {
            y.right = z;
        }
        z.left = null;
        z.right = null;
        z.c = Color.RED;
        RBInsertFix(T, z);
    }

    public void RBInsertFix(Node T, Node z)
    {
        Node y;

        while(z.parent.c == Color.RED)
        {
            if(z.parent == z.parent.parent.left)
            {
                y = z.parent.parent.right;
                if(y.c == Color.RED)
                {
                    z.parent.c = Color.BLACK;
                    y.c = Color.BLACK;
                    z.parent.parent.c = Color.RED;
                    z = z.parent.parent;
                }
                else if(z == z.parent.right)
                {
                    z = z.parent;
                    LeftRotate(T,z);
                }
                z.parent.c = Color.BLACK;
                z.parent.parent.c = Color.RED;
                RightRotate(T,z.parent.parent);
            }
            else
            {
                y = z.parent.parent.left;
                if(y.c == Color.RED)
                {
                    z.parent.c = Color.BLACK;
                    y.c = Color.BLACK;
                    z.parent.parent.c = Color.RED;
                    z = z.parent.parent;
                }
                else if(z == z.parent.left)
                {
                    z = z.parent;
                    LeftRotate(T,z);
                }
                z.parent.c = Color.BLACK;
                z.parent.parent.c = Color.RED;
                RightRotate(T,z.parent.parent);
            }
        }

        T.c = Color.BLACK;
    }

    public void LeftRotate(Node T, Node x)
    {
        Node y = x.right;
        x.right = y.left;
        if(y.left != null)
        {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if(x.parent == null)
        {
            T = y;
        }
        else if(x == x.parent.left)
        {
            x.parent.left = y;
        }
        else
        {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    public void RightRotate(Node T, Node x)
    {
        Node y = x.left;
        x.left = y.right;
        if(y.right != null)
        {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if(x.parent == null)
        {
            T = y;
        }
        else if(x == x.parent.right)
        {
            x.parent.right = y;
        }
        else
        {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }
}
