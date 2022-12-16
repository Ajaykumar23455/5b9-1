package Mh1a05b9.b9_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Experiment_11.Experiment_11.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
    	App a=new App();
    	int actual=a.add(15, 15);
    	int expected=30;
    	assertEquals(expected,actual);
         }
}
