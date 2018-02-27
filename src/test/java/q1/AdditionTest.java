package q1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AdditionTest {
    Addition addition = new Addition();

    @Test
    public void canaryTest(){
        Assert.assertTrue(true);
    }



    @Test
    public void testingWithTwoInt(){
        Assert.assertEquals(addition.sum(12,13),25);
        Assert.assertEquals(addition.sum(-12,12),0);
    }

    @Test
    public void testWithTwoFloats(){
        Assert.assertEquals(addition.sum(10.5f,50.2f),61.0f,0.30);
    }

    @Test
    public void testWithTwoDouble(){
        Assert.assertEquals(addition.sum(100.01,200.89),300.90,.1);
    }

    @Test
    public void testWithTwoString(){
        Assert.assertEquals(addition.sum("Neelesh ", "Bansal"),"Neelesh Bansal");
    }

    @Test
    public void testWithTwoList(){
        List<Integer> list1=Arrays.asList(10,20);

        List<Integer> list2=Arrays.asList(30,40,50);

        List<Integer> list3=Arrays.asList(10,20,30,40,50);

        Assert.assertEquals(addition.sum(list1,list2),list3);

    }


}
