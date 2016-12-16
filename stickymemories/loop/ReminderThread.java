
package stickymemories.loop;

import java.util.Calendar;
import java.util.Date;
import stickymemories.core.DataNotes;
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
                System.out.println("a");
                if(n != null){
                    if(n.getReminders() == null)
                        continue;
                    
                    if(!n.getReminders().isEmpty()){
                        System.out.println("b");
                        Date dt = new Date();
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(dt);
                        //System.out.println("now time: " + cal.getTimeInMillis());
                        //System.out.println("Reminder: " + n.getLatestReminder().getReminderTime());
                        if(n.getLatestReminder().getReminderTime() <= cal.getTimeInMillis()){
                            System.out.println("c");
                            if(checkReminders.isNotificationMode()){
                                Reminder r = n.getLatestReminder();
                                n.removeReminder(r);
                                new NotificationPopUp(n.getImagePath());
                                checkReminders.updateComparator();
                                System.out.println("d");
                            } else {
                                SystemNotifications sNotification = new SystemNotifications();
                                sNotification.showTextNotification("Sticky Memories", n.getImagePath());
                                Reminder r = n.getLatestReminder();
                                System.out.println(r.getAno() + ":" + r.getMes() + ":" + r.getDia() + ":" + r.getHora() + ":" + r.getMinuto());
                                n.removeReminder(r);
                                DataNotes.updateNote(n.getID(), n);
                                checkReminders.updateComparator();
                                System.out.println("e");
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
