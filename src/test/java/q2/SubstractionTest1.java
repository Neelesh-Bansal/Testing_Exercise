package q2;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import q1.Substraction;

import java.util.Arrays;
import java.util.List;

public class SubstractionTest1 {

    Substraction1 substraction1 = new Substraction1();

    @Test
    public void canaryTest(){

        Assert.assertTrue(true);
    }




    @Ignore("Not Ready Yet")
    @Test
    public void testingWithTwoInt(){
        Assert.assertEquals(substraction1.sub(12,13),-5);
        Assert.assertEquals(substraction1.sub(-12,12),-24);
    }

    @Test
    public void testWithTwoFloats(){

        Assert.assertEquals(substraction1.sub(50.5f,20.2f),30.3f,0.30);
    }

    @Test
    public void testWithTwoDouble(){
        Assert.assertEquals(substraction1.sub(200.86,100.81),100.05,.1);
    }


    @Test
    public void testWithTwoList(){
        List<Integer> list1= Arrays.asList(10,20,30,40);

        List<Integer> list2=Arrays.asList(20,30);

        List<Integer> list3=Arrays.asList(10,40);

        Assert.assertEquals(substraction1.sub(list1,list2),list3);

    }

    //Question 3 start

    @Test(expected = IndexOutOfBoundsException.class)
    public void arithmeticError(){
        int a[]=new int[1];
        a[0]=6;
        System.out.println (a[2]);
    }

    @Test(expected = ArithmeticException.class)
    public void arithmeticError2(){
        Assert.assertEquals(substraction1.div(1,0),0);
    }

    //Question3 ends

}
