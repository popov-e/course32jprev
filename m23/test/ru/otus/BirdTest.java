package ru.otus;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    @Test
    public void nameTest(){
        Bird bird = new Crow("Mag");

        Assert.assertEquals("Wrong name", "Mag", bird.getName());
        //System.out.println("Good BirdTest");

//        if (!bird.getName().equals("Mag")){
//            throw new RuntimeException("Wrong name");
//        }
    }

    @Test
    public void toStringTest(){
//        Bird bird = new Crow("Mag");
//        Assert.assertTrue(bird.toString().contains("Mag"));
    }

    
}
