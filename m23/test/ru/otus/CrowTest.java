package ru.otus;

import org.junit.Assert;
import org.junit.Test;

public class CrowTest {
    @Test
    public void flyingTest(){
        Crow crow = new Crow("Mag");
        crow.feed();
        Assert.assertFalse(crow.isFlying());
        //System.out.println("Good CrowTest");
    }
}
