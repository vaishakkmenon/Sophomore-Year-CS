import java.util.LinkedList;

public class BFS
{
    int origin;
    LinkedList<Vertex> input[];
    LinkedList<Vertex> reInput;

    public void BFSearch3(LinkedList<Vertex> V[], int source)
    {
        origin = source;
        LinkedList<Vertex> queue = new LinkedList<Vertex>();

        if(!(V[source].isEmpty()))
        {
            queue.add(V[source].removeFirst());
            while (queue.size() != 0) 
            {
                reInput = new LinkedList<Vertex>();
                reInput.add(queue.get(0));
                Vertex num = queue.poll();
                
                int initialSize = V[num.id].size();
                while ( !(V[num.id].isEmpty()) && num.accessed <= initialSize) 
                {
                    Vertex n = V[num.id].poll();
                    
                    //System.out.println(n.id);
                    if (!n.checked) 
                    {
                        n.checked = true;
                        n.p = num;
                        queue.add(n);
                        reInput.add(n);
                        num.accessed += 1;
                    }
                }
                
                if(reInput.size() != 0)
                {
                    V[num.id] = reInput;
                }
            }
        }
        input = V;
    }

    public void printPath(LinkedList<Vertex> input[], Vertex s, Vertex v)
    {
        if(s == v)
        {
            System.out.print(s.id + ": ");
        }
        else if(v.p == null)
        {
            System.out.print("No path from " + s.id + " to " + v.id + " exists");
        }
        else
        {
            printPath(input, s, v.p);
            System.out.print(v.id + " ");
        }

    }
}
