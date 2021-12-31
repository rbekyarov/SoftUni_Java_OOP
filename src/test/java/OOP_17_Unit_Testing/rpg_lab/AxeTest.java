package OOP_17_Unit_Testing.rpg_lab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {
    @Test
    public void testWeaponLosesDurability(){

        Axe axe = new Axe(10,10);
        Dummy dummy = new Dummy(100,100);

        axe.attack(dummy);

        Assert.assertEquals(9, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAxeBroken(){
        Axe brokenAxe = new Axe(10,0);
        Dummy dummy = new Dummy(100,100);
        brokenAxe.attack(dummy);
    }
}