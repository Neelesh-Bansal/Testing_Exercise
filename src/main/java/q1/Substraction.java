package q1;

import java.util.ArrayList;
import java.util.List;

public class Substraction {

    public int sub(int a, int b)
    {
        return a-b;
    }

    public double sub(double a, double b)
    {
        return a-b;
    }

    public float sub(float a, float b)
    {
        return a-b;
    }


    public List sub(List lista, List listb)
    {
        List<String> list = new ArrayList<>();
        list.addAll(lista);
        list.removeAll(listb);
        return list;
    }
}
