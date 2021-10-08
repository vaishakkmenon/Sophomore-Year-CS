package CS303.Lab6;

import java.util.ArrayList;

public class LogSort 
{
    public void iSort(ArrayList<String> A, ArrayList<Integer> B)
    {
        int i = 0;
        String key = "";
        int k = 0;
        int length = A.size();
        for (int j = 1; j < length; j++)
        {
            key = A.get(j);
            k = B.get(j);
            i = j - 1;
            while(i >= 0 && A.get(i).compareTo(key) > 0)
            {
                A.set(i+1,A.get(i));
                B.set(i+1,B.get(i));
                i = i - 1;
            }
            A.set(i+1, key);
            B.set(i+1, k);
        }
    }

    public ArrayList<String> convert(ArrayList<Integer> A)
    {
        ArrayList<String> B = new ArrayList<String>();
        
        for(int i : A)
        {
            String s = "0" + String.valueOf(i);
            StringBuffer sB = new StringBuffer(s);
            for(int j = 2; j < s.length(); j+=3)
            {
                sB.insert(j, ':');
            }
            String ns = sB.toString();
            B.add(ns);
        }
        return B;
    }
}
