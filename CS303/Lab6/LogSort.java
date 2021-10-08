package CS303.Lab6;

import java.util.ArrayList;

public class LogSort 
{
    public void sort(ArrayList<String> A, int p, int r)
    {
        if(p < r)
        {
            int q = Partition(A, p, r);
            sort(A, p, q-1);
            sort(A, q+1, r);
        }
    }

    public int Partition(ArrayList<String> A, int p, int r)
    {
        String x = A.get(r);
        int i = p - 1;

        for(int j = p; j <= r - 1; j++)
        {
            if(A.get(j).compareTo(x) < 0)
            {
                i++;
                String temp = A.get(i);
                A.set(i, A.get(j));
                A.set(j, temp);
            }
        }
        
        String temp = A.get(i + 1);
        A.set(i + 1, A.get(r));
        A.set(r, temp);

        return i + 1;
    }
}
