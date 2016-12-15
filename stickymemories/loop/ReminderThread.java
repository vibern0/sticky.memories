
package stickymemories.loop;

import java.util.Calendar;
import java.util.Date;
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
            try {
                Thread.sleep(1000);
                Note n = checkReminders.getLatestReminderNote();
                if(n != null){
                    if(!n.getReminders().isEmpty()){
                        Date dt = new Date();
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(dt);
                        //System.out.println("now time: " + cal.getTimeInMillis());
                        //System.out.println("Reminder: " + n.getLatestReminder().getReminderTime());
                        if(n.getLatestReminder().getReminderTime() <= cal.getTimeInMillis()){
                            if(checkReminders.isNotificationMode()){
                                Reminder r = n.getLatestReminder();
                                n.removeReminder(r);
                                new NotificationPopUp(n.getImagePath());
                                checkReminders.updateComparator();
                            } else {
                                SystemNotifications sNotification = new SystemNotifications();
                                sNotification.showTextNotification("Sticky Memories", n.getImagePath());
                                checkReminders.updateComparator();
                            }
                        }
                    }else{
                        System.out.println("Sem nota ainda");
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }
        
    }
}
