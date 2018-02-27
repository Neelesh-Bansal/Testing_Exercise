package q4;

import java.util.ArrayList;
import java.util.List;

public class Addition {


    public int sum(int a, int b)
    {
        return a+b;
    }

    public double sum(double a, double b)
    {
        return a+b;
    }

    public float sum(float a, float b)
    {
        return a+b;
    }

    public String sum(String a, String b)
    {
        return a+b;
    }

    public List sum(List lista, List listb)
    {
        List<String> list = new ArrayList<>();
        list.addAll(lista);
        list.addAll(listb);
        return list;
    }

}
