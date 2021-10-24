package CS303.Lab8;

public class Node 
{
    Double data;
    String s;
    Node left, right;
    
    Node(Double key, String description)
    {
        data = key;
        s = description;
        left = null;
        right = null;
    }
}
