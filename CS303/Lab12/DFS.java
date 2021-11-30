package CS303.Lab12;
import java.awt.Color;
import java.util.LinkedList;

public class DFS
{
    int time = 0;

    public void DFSearch(LinkedList<Vertex> V[])
    {
        time = 0;  

        for(LinkedList<Vertex> a : V)
        {
            for(Vertex b : a)
            {
                if(b.c == Color.WHITE)
                {
                    DFSVisit(V, b);
                }
            }
        }
    }

    public void DFSVisit(LinkedList<Vertex> V[], Vertex b)
    {
        time++;
        b.d = time;
        b.c = Color.GRAY;

        LinkedList<Vertex> restart = new LinkedList<Vertex>();
        while(V[b.id].size() != 0)
        {
            Vertex c = V[b.id].removeFirst();
            if(c.c == Color.WHITE)
            {
                c.p = b;
                DFSVisit(V, c);
            }
            restart.add(c);
        }
        V[b.id] = restart;
        b.c = Color.BLACK;
        time++;
        b.f = time;
    }

    public void printPath(LinkedList<Vertex> input[], Vertex s, Vertex v)
    {

        if(s == v)
        {
            System.out.print(s.id);
        }
        else if(v.p == null)
        {
            System.out.print("No path from " + s.id + " to " + v.id + " exists");
        }
        else
        {
            printPath(input, s, v.p);
            System.out.print(", " + v.id);
        }

    }

    public void topologicalSort(LinkedList<Vertex> V[])
    {
        DFSearch(V);

        Vertex[] returnList = new Vertex[V.length * 20];

        for(LinkedList<Vertex> d : V)
        {
            for(Vertex e : d)
            {
                returnList[e.f] = e;
            }
        }

        System.out.println("Topological Sort: ");
        for(Vertex f : returnList)
        {
            if(f != null)
            {
                System.out.print(f.id + " ");
            }
        }
    }
}