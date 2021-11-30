/* Author: Vaishak Menon, Date: 11/29/21 */
package CS303.Lab10;

public class RBNode<T> extends BSTNode<T>
{
    Double key;
    T description;
    RBNode<T> left, right, parent;
    boolean color;
    
    RBNode(Double inputKey, T s) 
    {
        super(inputKey, s);
        key = inputKey;
        description = s;
    }    
}
