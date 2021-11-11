import java.util.LinkedList;
import java.util.Queue;
import java.awt.Color;

public class BFS
{

    LinkedList<Vertex> L = new LinkedList<Vertex>();

    public void BFSearch(LinkedList<Vertex> sList, Vertex s)
    {
        L = sList;
        for(Vertex u : L)
        {
            u.c = Color.WHITE;
            u.d = Integer.MAX_VALUE;
            u.p = null;
        }
        s.c = Color.GRAY;
        s.d = 0;
        s.p = null;
        Queue<Vertex> Q = new LinkedList<Vertex>();
        Q.add(s);
        while(Q.size() != 0)
        {
            Vertex u = Q.poll();
            for(Vertex v : L)
            {
                if(v.c == Color.WHITE)
                {
                    v.c = Color.GRAY;
                    v.d = u.d + 1;
                    v.p = u;
                    Q.add(v);
                }
            }
            u.c = Color.BLACK;
        }
    }

    public void PrintPath(Vertex s, Vertex v)
    {
        if (v == s)
        {
            System.out.println(s);
        }
        else if(v.p == null)
        {
            System.out.println("No path from " + s + " to " + v + " exists!");
        }
        else
        {
            PrintPath(s, v.p);
            System.out.println(v);
        }
    }
}