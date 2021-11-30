/* Author: Vaishak Menon, Date: 11/29/21 */
package CS303.Lab10;

public class BST extends BSTNode<String>
{

    BST(Double key, String s)
    {
        super(key, s);
    }

    public static BSTNode<String> TreeInsert(BSTNode<String> T, BSTNode<String> z)
    {
        BSTNode<String> y = null;
        BSTNode<String> x = T;

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

        return T;
    }

    public void inOrderTreeWalk(BSTNode<String> x)
    {
        if(x != null)
        {
            inOrderTreeWalk(x.left);
            System.out.println(x.key);
            inOrderTreeWalk(x.right);
        }
    }

    public static BSTNode<String> search(BSTNode<String> x, double k)
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