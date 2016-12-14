/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.loop;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import stickymemories.core.Note;
import stickymemories.frames.NotificationPopUp;

/**
 *
 * @author bernardovieira
 */
public class ReminderThread extends Thread {

    private final CheckReminders checkReminders;
    private NotificationPopUp popUp;
    public ReminderThread(CheckReminders checkReminders) {
       this.checkReminders = checkReminders;
       popUp = null;
    }
    
    @Override
    public void run(){
        
        while(true){
            
            if(checkReminders.getNoteByReminder().isEmpty()){
                try {   
                    Thread.sleep(2 * 1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ReminderThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                Note n = checkReminders.getLatestReminderNote();
                Date dt = new Date();
                if(n.getLatestReminder().getReminderTime() == dt.getTime())
                    popUp = new NotificationPopUp(n.getImagePath());
                checkReminders.updateComparator();
                
            }
            
        }
        
    }
}
