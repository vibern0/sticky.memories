/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import stickymemories.core.DataNotes;
import stickymemories.core.Note;

/**
 *
 * @author bernardovieira
 */
public class CheckReminders {
    
    private static List<Note> note_by_reminder;
    public CheckReminders()
    {
        //load first time!
        reorganizeReminders();
        
        
    }
    
    
    public static void reorganizeReminders()
    {
        //
        note_by_reminder = new ArrayList<>();
        //
    }
    
}
