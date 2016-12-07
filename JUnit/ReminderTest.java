/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import stickymemories.core.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge
 */
public class ReminderTest {
        Reminder instance = null;
    public ReminderTest() {
        instance = new Reminder(2017,10,10,20,20);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getReminderTime method, of class Reminder.
     */
    @Test
    public void testGetReminderTime() {
        System.out.println("getReminderTime");
        long expResult = 0L;
        long result = instance.getReminderTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDia method, of class Reminder.
     */
    @Test
    public void testGetDia() {
        System.out.println("getDia");
        int expResult = 10;
        int result = instance.getDia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMes method, of class Reminder.
     */
    @Test
    public void testGetMes() {
        System.out.println("getMes");
        int expResult = 10;
        int result = instance.getMes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAno method, of class Reminder.
     */
    @Test
    public void testGetAno() {
        System.out.println("getAno");
        int expResult = 2017;
        int result = instance.getAno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHora method, of class Reminder.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        int expResult = 20;
        int result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMinuto method, of class Reminder.
     */
    @Test
    public void testGetMinuto() {
        System.out.println("getMinuto");
        int expResult = 20;
        int result = instance.getMinuto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
