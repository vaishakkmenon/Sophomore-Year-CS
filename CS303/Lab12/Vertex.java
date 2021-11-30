package CS303.Lab12;

import java.awt.Color;

public class Vertex 
{
    boolean checked = false;
    Color c = Color.WHITE;
    int id;
    Vertex p = null;
    int d = 0;
    int f = 0;

    public Vertex(int ID)
    {
        id = ID;
    }
}
