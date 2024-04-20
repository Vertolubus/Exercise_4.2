package org.example;
//задание 4.1.2
public class QuadraticTrinomialService
{
    private QuadraticTrinomial qt;

    public QuadraticTrinomialService(QuadraticTrinomial qt)
    {
        this.qt = qt;
    }

    public double theBiggestRoot()
    {
        if(qt.getRoots().length == 0) throw new IllegalArgumentException();
        if(qt.getRoots().length == 2)
        {
            if(qt.getRoots()[0] > qt.getRoots()[1]) return qt.getRoots()[0];
            else return qt.getRoots()[1];
        }
        else return qt.getRoots()[0];
    }
}
