/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bernardovieira
 */
public class Note implements Serializable {
    
    private List<Reminder> reminders;
    private final String image;
    private final long ID;
    
    public Note(String image)
    {
        this.image = image;
        this.reminders = new ArrayList<>();
        this.ID = new Date().getTime();
    }
    
    public long getID()
    {
        return ID;
    }
    
    public void setReminders(List<Reminder> reminders)
    {
        this.reminders = reminders;
    }
    
    public boolean addReminder(Reminder reminder)
    {
        return reminders.add(reminder);
    }
    
    public List<Reminder> getReminders()
    {
        return reminders;
    }
}
