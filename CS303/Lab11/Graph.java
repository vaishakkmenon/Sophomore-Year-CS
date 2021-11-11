import java.util.LinkedList;

public class Graph 
{
    LinkedList<LinkedList<Integer>> L;

    public Graph()
    {
        L = new LinkedList<LinkedList<Integer>>();
    }

    public void addVertex(int v, LinkedList<Integer> edges)
    {
        L.add(v,edges);
    }

    public LinkedList<Integer> createEdges(int[] edges)
    {
        LinkedList<Integer> lEdges = new LinkedList<Integer>();
        for(int i : edges)
        {
            lEdges.add(i);
        }
        return lEdges;
    }

    public LinkedList<Integer> V()
    {
        return L.getFirst();
    }

}
