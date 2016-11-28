/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bernardovieira
 */
public class DataNotes {
    
    private static List<Note> notes;
    
    public DataNotes()
    {
        //
        notes = new ArrayList<>();
    }
    
    public boolean add(String path_image, List<Reminder> reminders)
    {
        if(!saveImageApllicationFolder(path_image))
        {
            return false;
        }
        Note note = new Note(path_image);
        note.setReminders(reminders);
        notes.add(note);
        return true;
    }
    
    private boolean saveImageApllicationFolder(String path_image)
    {
        return false;
    }
    
    public boolean remove()
    {
        
        
        return false;
    }
}
