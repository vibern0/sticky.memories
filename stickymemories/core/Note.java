/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author bernardovieira
 */
public class Note implements Serializable {
    
    private List<Reminder> reminders;
    private String image;
    private final long ID;
   
    public Note(String image, List<Reminder> reminders)
    {
        this.image = image;
        this.reminders = reminders;
        this.ID = new Date().getTime();
    }
    
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
    
    public Reminder getNextReminder()
    {
        return reminders.get(0);
    }
    
    public String getImagePath()
    {
        return image;
    }
    
    public void setImagePath(String imagePath){
        this.image = imagePath;
    }
    
    public ImageIcon getImage()
    {
        String path = image;
        return Constants.getSelectedImageIcon(1, path);
    }
    
    public Reminder getLatestReminder(){
        if(reminders.size() > 0){
            Reminder temp = reminders.get(0);
            for (Reminder r : reminders) {
             if(r.getReminderTime() > temp.getReminderTime())
                 temp = r;
            }
            return temp;
        }
        return null;
    }

    public void removeReminder(Reminder r) {
        reminders.remove(r);
    }
    
}
