/* Author: Vaishak Menon, Date: 11/29/21 */
package CS303.Lab10;

public class RBTree extends BST
{
    static RBNode<String> rootNode;
    static RBNode<String> nil = new RBNode<String> (null, null);

    RBTree(RBNode<String> root, Double key, String s)
    {
        super(key, s);
        rootNode = root;
        rootNode.left = nil;
        rootNode.right = nil;
        rootNode.parent = nil;
        nil.left = null;
        nil.right = null;
        nil.parent = null;
        nil.color = true;
    }

    RBTree(Double key, String s) 
    {
        super(key, s);
    }

    public void RBInsert(RBNode<String> z)
    {
        RBNode<String> y = nil;
        RBNode<String> x = rootNode;
        while(x != nil)
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
        z.parent = nil;
        if(y == nil)
        {
            rootNode = z;
        }
        else if(z.key < y.key)
        {
            y.left = z;
        }
        else
        {
            y.right = z;
        }
        z.left = nil;
        z.right = nil;
        z.color = false;
        RBInsertFix(rootNode, z);
    }

    public static void RBInsertFix(RBNode<String> T, RBNode<String> z)
    {
        RBNode<String> y;

        while (z.parent.color == false) 
        {
            if (z.parent == z.parent.parent.left) 
            {
                y = z.parent.parent.right;
                if (y.color == false) 
                {
                    z.parent.color = true;
                    y.color = true;
                    z.parent.parent.color = false;
                    z = z.parent.parent;
                } 
                else 
                {
                    if (z == z.parent.right) 
                    {
                        z = z.parent;
                        LeftRotate(T, z);
                    }
                    z.parent.color = true;
                    z.parent.parent.color = false;
                    RightRotate(T, z.parent.parent);
                }
            } 
            else 
            {
                y = z.parent.parent.left;
                if (y.color == false) 
                {
                    z.parent.color = true;
                    y.color = true;
                    z.parent.parent.color = false;
                    z = z.parent.parent;
                }
                else if (z == z.parent.left) 
                {
                    z = z.parent;
                    LeftRotate(T, z);
                }
                z.parent.color = true;
                z.parent.parent.color = false;
                RightRotate(T, z.parent.parent);
            }
        }

        T.color = true;
    }

    public static void LeftRotate(RBNode<String> T, RBNode<String> x)
    {
        RBNode<String> y = x.right;
        x.right = y.left;
        if(y.left != nil)
        {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if(x.parent == nil)
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

    public static void RightRotate(RBNode<String> T, RBNode<String> x)
    {
        RBNode<String> y = x.left;
        x.left = y.right;
        if(y.right != nil)
        {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if(x.parent == nil)
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

    public void inOrderTreeWalk(RBNode<String> x)
    {
        if(x != null && x != nil)
        {
            inOrderTreeWalk(x.left);
            //System.out.println(x.key);
            inOrderTreeWalk(x.right);
        }
    }

    public RBNode<String> search(RBNode<String> x, double k)
    {
        while((x != null) && (k != x.key))
        {
            if(k < x.key)
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
