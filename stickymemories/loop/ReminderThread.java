/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.loop;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import stickymemories.core.Note;
import stickymemories.core.Reminder;
import stickymemories.core.os.OsCheck;
import stickymemories.core.os.SystemNotifications;
import stickymemories.frames.NotificationPopUp;

/**
 *
 * @author bernardovieira
 */
public class ReminderThread extends Thread {

    private final CheckReminders checkReminders;
    public ReminderThread(CheckReminders checkReminders) {
       this.checkReminders = checkReminders;
    }
    
    @Override
    public void run(){
        
        while(true){
            //System.out.println("Entrei na thread");
//            if(checkReminders.getNoteByReminder().isEmpty()){
//                try {   
//                    Thread.sleep(2 * 1000);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(ReminderThread.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            else{
                Note n = checkReminders.getLatestReminderNote();
                if(n != null){
                    if(!n.getReminders().isEmpty()){
                        Date dt = new Date();
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(dt);
                        System.out.println("now time: " + cal.getTimeInMillis());
                        System.out.println("Reminder: " + n.getLatestReminder().getReminderTime());
                        if(n.getLatestReminder().getReminderTime() <= cal.getTimeInMillis()){
                            if(checkReminders.isNotificationMode()){
                                Reminder r = n.getLatestReminder();
                                n.removeReminder(r);
                                NotificationPopUp popUp = new NotificationPopUp(n.getImagePath());
                                checkReminders.updateComparator();
                            }
//                            else{
//                                SystemNotifications sNotification = new SystemNotifications(OsCheck.getOperatingSystemType());
//                                sNotification.showTextNotification("Sticky Memories",n.getImagePath());
//                                checkReminders.updateComparator();
//                            }
                        }   
                    }else{
                        System.out.println("Sem nota ainda");
                    }
                }
            
        }
        
    }
}
