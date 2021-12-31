package OOP_17_Unit_Testing.rpg_lab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {
    @Test
    public void testDummyHealthAfterAttack(){
      Dummy dummy = new Dummy(100,100);
      dummy.takeAttack(10);
        Assert.assertEquals(90,dummy.getHealth());
    }
    @Test(expected=IllegalStateException.class)
    public void testDummyDead(){
        Dummy dummy = new Dummy(0,100);
        dummy.takeAttack(10);
    }
}