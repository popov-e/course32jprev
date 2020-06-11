package ru.otus;

import org.junit.Assert;
import org.junit.Test;

public class BlackbirdTest {
    @Test
    public void flyingTest(){
        Blackbird blackbird = new Blackbird("Terry");
        blackbird.feed();
        Assert.assertTrue(blackbird.isFlying());
        //System.out.println("Good BlackbirdTest");
    }
}
