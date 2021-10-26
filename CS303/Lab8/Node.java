/* Author: Vaishak Menon, Date: 10/26/21 */
package CS303.Lab8;

public class Node 
{
    Double key;
    String description;
    Node left, right;
    
    Node(Double inputKey, String s)
    {
        key = inputKey;
        description = s;
        left = null;
        right = null;
    }
}
