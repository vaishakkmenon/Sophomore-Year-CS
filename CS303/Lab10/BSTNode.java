/* Author: Vaishak Menon, Date: 11/29/21 */
package CS303.Lab10;

public class BSTNode<T> 
{
    Double key;
    T description;
    BSTNode<T> left, right;

    BSTNode(Double inputKey, T s)
    {
        key = inputKey;
        description = s;
        left = null;
        right = null;
    }
}
