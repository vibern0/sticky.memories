/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bernardovieira
 */
public class Note implements Serializable {
    
    private List<Reminder> reminders;
    
    public Note(String title)
    {
        reminders = new ArrayList<>();
    }
    
    public boolean addReminder(Reminder reminder)
    {
        return reminders.add(reminder);
    }
}
