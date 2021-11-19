public class Vertex 
{
    boolean checked = false;
    int id;
    Vertex p = null;
    int accessed = 0;

    public Vertex(int ID)
    {
        id = ID;
    }
}
