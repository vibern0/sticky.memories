package JUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import stickymemories.core.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge
 */
public class NoteTest {
    Note instance;
    List<Reminder> reminders;
        Reminder reminder = new Reminder(21, 10,
                            2016, 20, 21);
        Reminder reminder1 = new Reminder(20, 10,
                            2016, 20, 21);
    public NoteTest() {
        reminders = new ArrayList<>();
        reminders.add(reminder);
        instance = new Note(Constants.PATH_IMG_DEFFAULT_IMAGE, reminders);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getID method, of class Note.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        long expResult = 1481149915033L;
        long result = instance.getID();
        if(result != 0){
        }else{
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setReminders method, of class Note.
     */
    @Test
    public void testSetReminders() {
        System.out.println("setReminders");
        instance.setReminders(reminders);
        
            fail("The test case is a prototype.");
    }

    /**
     * Test of addReminder method, of class Note.
     */
    
    @Test
    public void testAddReminder() {
        System.out.println("addReminder");
        boolean expResult = true;
                int remindersBefore = instance.getReminders().size();
        boolean result = instance.addReminder(reminder);
                int remindersAfter = instance.getReminders().size();
        assertEquals(expResult, result);
        if(remindersAfter != remindersBefore){
        }
        else
            fail("The test case is a prototype.");
    }

    /**
     * Test of getReminders method, of class Note.
     */
    @Test
    public void testGetReminders() {
        System.out.println("getReminders");
        List<Reminder> expResult = null;
        List<Reminder> result = instance.getReminders();
        if(result != null){}
        else
            fail("The test case is a prototype.");
    }

    /**
     * Test of getNextReminder method, of class Note.
     */
    @Test
    public void testGetNextReminder() {
        System.out.println("getNextReminder");
        Reminder expResult = null;
        Reminder result = instance.getNextReminder();
       if(result != null){}
        else
            fail("The test case is a prototype.");
    }

    /**
     * Test of getImagePath method, of class Note.
     */
    @Test
    public void testGetImagePath() {
        System.out.println("getImagePath");
        String expResult = "";
        String result = instance.getImagePath();
        if(result != null){}
        else
            fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Note.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        ImageIcon expResult = null;
        ImageIcon result = instance.getImage();
        if(result != null){}
        else
            fail("The test case is a prototype.");
    }

    /**
     * Test of getLatestReminder method, of class Note.
     */
    @Test
    public void testGetLatestReminder() {
        System.out.println("getLatestReminder");
        Reminder expResult = null;
        Reminder result = instance.getLatestReminder();
        if(result != null){}
        else
            fail("The test case is a prototype.");
    }
    
}
