/* Author: Vaishak Menon, Date: 10/26/21 */
package CS303.Lab10;

import java.awt.Color;

public class Node 
{
    Double key;
    String description;
    Node left, right, parent;
    Color c;
    
    Node(Double inputKey, String s)
    {
        key = inputKey;
        description = s;
        left = null;
        right = null;
    }
}
