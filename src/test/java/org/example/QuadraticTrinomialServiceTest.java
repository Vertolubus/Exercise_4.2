package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuadraticTrinomialServiceTest {

    @Test
    public void theBiggestRoot()
    {
        QuadraticTrinomial qt1 = new QuadraticTrinomial(1, 5, 4); // корни -4, -1
        QuadraticTrinomial qt2 = new QuadraticTrinomial(1, 4, 4); // корни -2
        QuadraticTrinomial qt3 = new QuadraticTrinomial(1, 2, 3); // корни нет
        QuadraticTrinomial qt4 = new QuadraticTrinomial(0, 4, 4); // корни -1
        QuadraticTrinomial qt5 = new QuadraticTrinomial(0, 0, 3); // корни нет
        QuadraticTrinomial qt6 = new QuadraticTrinomial(0, 0, 0); // корни infinity

        QuadraticTrinomialService qts1 = new QuadraticTrinomialService(qt1);
        QuadraticTrinomialService qts2 = new QuadraticTrinomialService(qt2);
        QuadraticTrinomialService qts3 = new QuadraticTrinomialService(qt3);
        QuadraticTrinomialService qts4 = new QuadraticTrinomialService(qt4);
        QuadraticTrinomialService qts5 = new QuadraticTrinomialService(qt5);
        QuadraticTrinomialService qts6 = new QuadraticTrinomialService(qt6);

        assertEquals(-1.0, qts1.theBiggestRoot(),2);
        assertEquals(-2.0, qts2.theBiggestRoot(),2);
        assertEquals(-1.0, qts4.theBiggestRoot(),2);
        assertEquals(1.0 / 0.0, qts6.theBiggestRoot(),2);

        try
        {
            qts3.theBiggestRoot();
        }
        catch (Exception exception)
        {
            System.out.println("Нет корней");
        }

        try
        {
            qts5.theBiggestRoot();
        }
        catch (Exception exception)
        {
            System.out.println("Нет корней");
        }
    }
}