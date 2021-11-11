import java.awt.Color;
import java.util.LinkedList;

public class Vertex 
{
    int id;
    Color c;
    int d;
    Vertex p;
    LinkedList<Integer> e;

    public Vertex(int vNum, LinkedList<Integer> edges)
    {
        id = vNum;
        e = edges;
    }

    public Vertex(int vNum, Color color, int distance, Vertex parent, LinkedList<Integer> edges)
    {
        id = vNum;
        c = color;
        d = distance;
        p = parent;
        e = edges;
    }    
}
