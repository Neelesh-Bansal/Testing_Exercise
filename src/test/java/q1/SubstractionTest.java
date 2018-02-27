package q1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SubstractionTest {

    Substraction substraction = new Substraction();

    @Test
    public void canaryTest(){
        Assert.assertTrue(true);
    }




    @Test
    public void testingWithTwoInt(){
        Assert.assertEquals(substraction.sub(12,13),-1);
        Assert.assertEquals(substraction.sub(-12,12),-24);
    }

    @Test
    public void testWithTwoFloats(){
        Assert.assertEquals(substraction.sub(50.5f,20.2f),30.3f,0.30);
    }

    @Test
    public void testWithTwoDouble(){
        Assert.assertEquals(substraction.sub(200.86,100.81),100.05,.1);
    }


    @Test
    public void testWithTwoList(){
        List<Integer> list1= Arrays.asList(10,20,30,40);

        List<Integer> list2=Arrays.asList(20,30);

        List<Integer> list3=Arrays.asList(10,40);

        Assert.assertEquals(substraction.sub(list1,list2),list3);

    }

}
