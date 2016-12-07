/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.core.order;

import java.util.Comparator;
import stickymemories.core.Note;

/**
 *
 * @author bernardovieira
 */
public class ByReminderOrderDesc implements Comparator<Note> {

    @Override
    public int compare(Note t, Note t1) {
//        if(t.getLatestReminder() == null || t1.getLatestReminder() == null)
//            return 0;
        return Long.valueOf(t1.getLatestReminder().getReminderTime()).compareTo(t.getLatestReminder().getReminderTime());
    }
    
}
